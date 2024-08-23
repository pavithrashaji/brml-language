package org.xtext.example.brml.generator;

import com.google.common.base.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.brml.bRML.AddRouteStop;
import org.xtext.example.brml.bRML.Bus;
import org.xtext.example.brml.bRML.DelBus;
import org.xtext.example.brml.bRML.DelRoute;
import org.xtext.example.brml.bRML.DelStop;
import org.xtext.example.brml.bRML.DeleteRouteStop;
import org.xtext.example.brml.bRML.Location;
import org.xtext.example.brml.bRML.Model;
import org.xtext.example.brml.bRML.Operation;
import org.xtext.example.brml.bRML.PrintBus;
import org.xtext.example.brml.bRML.PrintRoute;
import org.xtext.example.brml.bRML.PrintStop;
import org.xtext.example.brml.bRML.Route;
import org.xtext.example.brml.bRML.RouteStop;
import org.xtext.example.brml.bRML.Stop;

@SuppressWarnings("all")
public class BRMLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    final Model model = ((Model) _get);
    EList<Operation> _operations = model.getOperations();
    for (final Operation operation : _operations) {
      boolean _matched = false;
      if (operation instanceof Route) {
        _matched=true;
        this.generateRoute(((Route)operation), fsa);
      }
      if (!_matched) {
        if (operation instanceof Bus) {
          _matched=true;
          this.generateBus(((Bus)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof Stop) {
          _matched=true;
          this.generateStop(((Stop)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof AddRouteStop) {
          _matched=true;
          this.generateAddRouteStop(((AddRouteStop)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof DeleteRouteStop) {
          _matched=true;
          this.generateDeleteRouteStop(((DeleteRouteStop)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof DelRoute) {
          _matched=true;
          this.generateDelRoute(((DelRoute)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof DelBus) {
          _matched=true;
          this.generateDelBus(((DelBus)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof DelStop) {
          _matched=true;
          this.generateDelStop(((DelStop)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof PrintRoute) {
          _matched=true;
          this.generatePrintRoute(((PrintRoute)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof PrintBus) {
          _matched=true;
          this.generatePrintBus(((PrintBus)operation), fsa);
        }
      }
      if (!_matched) {
        if (operation instanceof PrintStop) {
          _matched=true;
          this.generatePrintStop(((PrintStop)operation), fsa);
        }
      }
    }
  }

  public Path generateRoute(final Route route, final IFileSystemAccess2 fsa) {
    Path _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Route: ");
      int _route = route.getRoute();
      _builder.append(_route);
      final String routeLabel = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(routeLabel);
      _builder_1.append("\\n");
      final String routeContent = _builder_1.toString();
      int _route_1 = route.getRoute();
      String _plus = (Integer.valueOf(_route_1) + " ");
      final Function1<RouteStop, Stop> _function = (RouteStop rs) -> {
        return rs.getRoutestop();
      };
      String _join = IterableExtensions.join(ListExtensions.<RouteStop, Stop>map(route.getRouteStops(), _function), " ");
      final String routeInfo = (_plus + _join);
      Path _xtrycatchfinallyexpression = null;
      try {
        Path _xblockexpression_1 = null;
        {
          final File routesFile = new File("routes.txt");
          boolean _exists = routesFile.exists();
          boolean _not = (!_exists);
          if (_not) {
            routesFile.createNewFile();
          }
          String _lineSeparator = System.lineSeparator();
          _xblockexpression_1 = Files.write(Paths.get("routes.txt"), (routeInfo + _lineSeparator).getBytes(), StandardOpenOption.APPEND);
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }

  public String generateDelRoute(final DelRoute delRoute, final IFileSystemAccess2 fsa) {
    final Route route = delRoute.getRoute();
    final int routename = route.getRoute();
    final String routeName = Integer.valueOf(routename).toString();
    this.deleteEntry("routes.txt", routeName);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"DelRoute\" [");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("label=\"Delete Route: ");
    _builder.append(routeName, "\t        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("];");
    return _builder.toString();
  }

  public void generateRouteStop(final RouteStop routeStop, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("RouteStop: ");
    Stop _routestop = routeStop.getRoutestop();
    _builder.append(_routestop);
    final String routeStopLabel = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(routeStopLabel);
    final String routeStopContent = _builder_1.toString();
  }

  public Path generateBus(final Bus bus, final IFileSystemAccess2 fsa) {
    Path _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Bus: ");
      String _bus = bus.getBus();
      _builder.append(_bus);
      _builder.append(" Driven by ");
      String _driver = bus.getDriver();
      _builder.append(_driver);
      _builder.append(" on Route ");
      int _route = bus.getRoute().getRoute();
      _builder.append(_route);
      final String busLabel = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(busLabel);
      final String busContent = _builder_1.toString();
      String _bus_1 = bus.getBus();
      String _plus = ("Bus: " + _bus_1);
      String _plus_1 = (_plus + " Driven by ");
      String _driver_1 = bus.getDriver();
      String _plus_2 = (_plus_1 + _driver_1);
      String _plus_3 = (_plus_2 + " on Route ");
      int _route_1 = bus.getRoute().getRoute();
      final String busInfo = (_plus_3 + Integer.valueOf(_route_1));
      Path _xtrycatchfinallyexpression = null;
      try {
        Path _xblockexpression_1 = null;
        {
          final File busesFile = new File("buses.txt");
          boolean _exists = busesFile.exists();
          boolean _not = (!_exists);
          if (_not) {
            busesFile.createNewFile();
          }
          String _lineSeparator = System.lineSeparator();
          _xblockexpression_1 = Files.write(Paths.get("buses.txt"), (busInfo + _lineSeparator).getBytes(), StandardOpenOption.APPEND);
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }

  public Path generateStop(final Stop stop, final IFileSystemAccess2 fsa) {
    Path _xblockexpression = null;
    {
      final Location location = stop.getLocation();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Stop: ");
      String _stop = stop.getStop();
      _builder.append(_stop);
      _builder.append(" at Location ");
      String _latitude = location.getLatitude();
      _builder.append(_latitude);
      _builder.append(", ");
      String _longitude = location.getLongitude();
      _builder.append(_longitude);
      final String stopLabel = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(stopLabel);
      final String stopContent = _builder_1.toString();
      String _stop_1 = stop.getStop();
      String _plus = ("Stop: " + _stop_1);
      String _plus_1 = (_plus + " at Location ");
      String _latitude_1 = stop.getLocation().getLatitude();
      String _plus_2 = (_plus_1 + _latitude_1);
      String _plus_3 = (_plus_2 + ", ");
      String _longitude_1 = stop.getLocation().getLongitude();
      final String stopInfo = (_plus_3 + _longitude_1);
      Path _xtrycatchfinallyexpression = null;
      try {
        Path _xblockexpression_1 = null;
        {
          final File stopsFile = new File("stops.txt");
          boolean _exists = stopsFile.exists();
          boolean _not = (!_exists);
          if (_not) {
            stopsFile.createNewFile();
          }
          String _lineSeparator = System.lineSeparator();
          _xblockexpression_1 = Files.write(Paths.get("stops.txt"), (stopInfo + _lineSeparator).getBytes(), StandardOpenOption.APPEND);
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }

  public String generateDelStop(final DelStop delStop, final IFileSystemAccess2 fsa) {
    try {
      final List<String> lines = Files.readAllLines(Paths.get("stops.txt"));
      final Function1<String, Boolean> _function = (String stop) -> {
        boolean _startsWith = stop.startsWith(delStop.getStop().getStop());
        return Boolean.valueOf((!_startsWith));
      };
      final Iterable<String> updatedLines = IterableExtensions.<String>filter(lines, _function);
      final FileWriter writer = new FileWriter("stops.txt");
      final PrintWriter printWriter = new PrintWriter(writer);
      final Consumer<String> _function_1 = (String it) -> {
        printWriter.println(it);
      };
      updatedLines.forEach(_function_1);
      printWriter.close();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"DelStop\" [");
      _builder.newLine();
      _builder.append("\t        ");
      _builder.append("label=\"Delete Stop: ");
      String _stop = delStop.getStop().getStop();
      _builder.append(_stop, "\t        ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t    ");
      _builder.append("];");
      return _builder.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public Path generateAddRouteStop(final AddRouteStop addRouteStop, final IFileSystemAccess2 fsa) {
    try {
      Path _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("AddRouteStop: ");
        Stop _routeStop = addRouteStop.getRouteStop();
        _builder.append(_routeStop);
        _builder.append(" to Route ");
        int _route = addRouteStop.getRoute().getRoute();
        _builder.append(_route);
        final String addRouteStopLabel = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(addRouteStopLabel);
        final String addRouteStopContent = _builder_1.toString();
        final List<String> routeInfo = Files.readAllLines(Paths.get("routes.txt"));
        final Function1<String, String> _function = (String route) -> {
          String _xifexpression = null;
          boolean _startsWith = route.startsWith(Integer.valueOf(addRouteStop.getRoute().getRoute()).toString());
          if (_startsWith) {
            Stop _routeStop_1 = addRouteStop.getRouteStop();
            _xifexpression = ((route + " ") + _routeStop_1);
          } else {
            _xifexpression = route;
          }
          return _xifexpression;
        };
        final List<String> updatedRouteInfo = ListExtensions.<String, String>map(routeInfo, _function);
        _xblockexpression = Files.write(Paths.get("routes.txt"), IterableExtensions.join(updatedRouteInfo, System.lineSeparator()).getBytes());
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public Path generateDeleteRouteStop(final DeleteRouteStop deleteRouteStop, final IFileSystemAccess2 fsa) {
    try {
      Path _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("DeleteRouteStop: ");
        Stop _routeStop = deleteRouteStop.getRouteStop();
        _builder.append(_routeStop);
        _builder.append(" from Route ");
        int _route = deleteRouteStop.getRoute().getRoute();
        _builder.append(_route);
        final String deleteRouteStopLabel = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(deleteRouteStopLabel);
        final String deleteRouteStopContent = _builder_1.toString();
        final List<String> routeInfo = Files.readAllLines(Paths.get("routes.txt"));
        final Function1<String, String> _function = (String route) -> {
          String _xifexpression = null;
          boolean _startsWith = route.startsWith(Integer.valueOf(deleteRouteStop.getRoute().getRoute()).toString());
          if (_startsWith) {
            String _xblockexpression_1 = null;
            {
              final String[] stops = route.split(" ");
              final Function1<String, Boolean> _function_1 = (String stop) -> {
                Stop _routeStop_1 = deleteRouteStop.getRouteStop();
                return Boolean.valueOf((!Objects.equal(stop, _routeStop_1)));
              };
              final String updatedStops = IterableExtensions.join(IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(stops)), _function_1), " ");
              int _route_1 = deleteRouteStop.getRoute().getRoute();
              String _plus = (Integer.valueOf(_route_1) + " ");
              _xblockexpression_1 = (_plus + updatedStops);
            }
            _xifexpression = _xblockexpression_1;
          } else {
            _xifexpression = route;
          }
          return _xifexpression;
        };
        final List<String> updatedRouteInfo = ListExtensions.<String, String>map(routeInfo, _function);
        _xblockexpression = Files.write(Paths.get("routes.txt"), IterableExtensions.join(updatedRouteInfo, System.lineSeparator()).getBytes());
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public String generateDelBus(final DelBus delBus, final IFileSystemAccess2 fsa) {
    String _bus = delBus.getBus().getBus();
    String _plus = ("Bus: " + _bus);
    String _plus_1 = (_plus + " Driven by ");
    String _driver = delBus.getBus().getDriver();
    String _plus_2 = (_plus_1 + _driver);
    String _plus_3 = (_plus_2 + " on Route ");
    int _route = delBus.getBus().getRoute().getRoute();
    final String busInfo = (_plus_3 + Integer.valueOf(_route));
    this.deleteEntry("buses.txt", busInfo);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"DelBus\" [");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("label=\"Delete Bus: ");
    String _bus_1 = delBus.getBus().getBus();
    _builder.append(_bus_1, "\t        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("];");
    return _builder.toString();
  }

  public String generatePrintRoute(final PrintRoute printRoute, final IFileSystemAccess2 fsa) {
    final int routeName = printRoute.getRoute().getRoute();
    final List<String> routeInfo = this.readFile("routes.txt");
    final Function1<String, Boolean> _function = (String r) -> {
      String _plus = (Integer.valueOf(routeName) + " ");
      return Boolean.valueOf(r.startsWith(_plus));
    };
    final String routeDetails = IterableExtensions.<String>findFirst(routeInfo, _function);
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(routeDetails, null));
    if (_notEquals) {
      int _length = Integer.valueOf(routeName).toString().length();
      int _plus = (_length + 1);
      _xifexpression = routeDetails.substring(_plus);
    } else {
      _xifexpression = "No stops found for route «routeName»";
    }
    final String routeDescription = _xifexpression;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"PrintRoute\" [");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("label=\"Print Route: ");
    _builder.append(routeName, "\t        ");
    _builder.append("\\nRoute Stops:\\n");
    _builder.append(routeDescription, "\t        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("];");
    return _builder.toString();
  }

  public void startsWith(final Object object, final String string) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }

  public String generatePrintBus(final PrintBus printBus, final IFileSystemAccess2 fsa) {
    final Bus bus = printBus.getBus();
    final List<String> busInfo = this.readFile("buses.txt");
    String _bus = bus.getBus();
    String _plus = ("Bus:" + _bus);
    final String busDetails = this.findFirst(busInfo, _plus);
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(busDetails, null));
    if (_notEquals) {
      _xifexpression = busDetails.replace("Bus: ", "Print Bus:\n");
    } else {
      _xifexpression = "No information found for bus «bus.bus»";
    }
    final String label = _xifexpression;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"PrintBus\" [");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("label=\"");
    _builder.append(label, "\t        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("];");
    return _builder.toString();
  }

  public String generatePrintStop(final PrintStop printStop, final IFileSystemAccess2 fsa) {
    final Stop stop = printStop.getStop();
    final Location location = stop.getLocation();
    final List<String> stopInfo = this.readFile("stops.txt");
    String _stop = stop.getStop();
    String _plus = ("Stop:" + _stop);
    final String stopDetails = this.findFirst(stopInfo, _plus);
    final List<String> routesInfo = this.readFile("routes.txt");
    final Function1<String, String> _function = (String line) -> {
      return IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(line.toString().split(" ", 2))));
    };
    final String routesContainingStop = IterableExtensions.join(ListExtensions.<String, String>map(this.<String>filter(routesInfo, stop.getStop()), _function), ", ");
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(stopDetails, null));
    if (_notEquals) {
      _xifexpression = stopDetails.replace("Stop: ", "Print Stop:\n");
    } else {
      _xifexpression = "No information found for stop «stop.stop»";
    }
    final String stopLabel = _xifexpression;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(stopLabel);
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("Location: Latitude: ");
    String _latitude = location.getLatitude();
    _builder.append(_latitude, "\t        ");
    _builder.append(", Longitude: ");
    String _longitude = location.getLongitude();
    _builder.append(_longitude, "\t        ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("Routes Containing Stop: ");
    _builder.append(routesContainingStop, "\t        ");
    final String label = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("PrintStop [");
    _builder_1.newLine();
    _builder_1.append("\t        ");
    _builder_1.append("label=\"");
    _builder_1.append(label, "\t        ");
    _builder_1.append("\"");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t    ");
    _builder_1.append("];");
    return _builder_1.toString();
  }

  public String findFirst(final List<String> lines, final String searchString) {
    for (final String line : lines) {
      boolean _contains = line.contains(searchString);
      if (_contains) {
        return line;
      }
    }
    return null;
  }

  public <T extends Object> List<T> filter(final List<T> lines, final String searchString) {
    final ArrayList<T> filteredList = CollectionLiterals.<T>newArrayList();
    for (final T element : lines) {
      boolean _contains = element.toString().contains(searchString);
      if (_contains) {
        filteredList.add(element);
      }
    }
    return filteredList;
  }

  public Path appendToFile(final String filename, final String content) {
    Path _xtrycatchfinallyexpression = null;
    try {
      Path _xblockexpression = null;
      {
        final File file = new File(filename);
        boolean _exists = file.exists();
        boolean _not = (!_exists);
        if (_not) {
          file.createNewFile();
        }
        String _lineSeparator = System.lineSeparator();
        _xblockexpression = Files.write(Paths.get(filename), (content + _lineSeparator).getBytes(), StandardOpenOption.APPEND);
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  public Path deleteEntry(final String filename, final String entry) {
    Path _xtrycatchfinallyexpression = null;
    try {
      Path _xblockexpression = null;
      {
        final File file = new File(filename);
        Path _xifexpression = null;
        boolean _exists = file.exists();
        if (_exists) {
          Path _xblockexpression_1 = null;
          {
            final List<String> lines = Files.readAllLines(Paths.get(filename));
            final Function1<String, Boolean> _function = (String it) -> {
              return Boolean.valueOf((!Objects.equal(it, entry)));
            };
            final Iterable<String> updatedLines = IterableExtensions.<String>filter(lines, _function);
            _xblockexpression_1 = Files.write(Paths.get(filename), updatedLines, StandardCharsets.UTF_8);
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  public List<String> readFile(final String fileName) {
    try {
      return Files.readAllLines(Paths.get(fileName));
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
        return CollectionLiterals.<String>newArrayList();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public Path writeFile(final String filename, final Iterable<String> content) {
    Path _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = Files.write(Paths.get(filename), IterableExtensions.join(content, System.lineSeparator()).getBytes());
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}
