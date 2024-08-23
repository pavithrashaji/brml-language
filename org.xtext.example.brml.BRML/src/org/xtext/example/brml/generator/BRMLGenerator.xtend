package org.xtext.example.brml.generator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.xbase.lib.StringExtensions
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.io.FileWriter
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.io.File
import java.io.IOException
import org.xtext.example.brml.brml.*
import org.xtext.example.brml.bRML.DeleteRouteStop
import org.xtext.example.brml.bRML.Route
import org.xtext.example.brml.bRML.Bus
import org.xtext.example.brml.bRML.Stop
import org.xtext.example.brml.bRML.AddRouteStop
import org.xtext.example.brml.bRML.DelRoute
import org.xtext.example.brml.bRML.DelBus
import org.xtext.example.brml.bRML.DelStop
import org.xtext.example.brml.bRML.PrintBus
import org.xtext.example.brml.bRML.PrintRoute
import org.xtext.example.brml.bRML.PrintStop
import org.xtext.example.brml.bRML.Model
import org.xtext.example.brml.bRML.RouteStop
import java.util.List

class BRMLGenerator extends AbstractGenerator {
override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.get(0) as Model
		for (operation : model.operations) {
          switch operation {
              Route: generateRoute(operation, fsa)
              Bus: generateBus(operation, fsa)
              Stop: generateStop(operation, fsa)
              AddRouteStop: generateAddRouteStop(operation, fsa)
              DeleteRouteStop: generateDeleteRouteStop(operation, fsa)
              DelRoute: generateDelRoute(operation, fsa)
              DelBus: generateDelBus(operation, fsa)
              DelStop: generateDelStop(operation, fsa)
              PrintRoute: generatePrintRoute(operation, fsa)
              PrintBus: generatePrintBus(operation, fsa)
              PrintStop: generatePrintStop(operation, fsa)
         }
	}
}
	def generateRoute(Route route, IFileSystemAccess2 fsa) {
	    val routeLabel = '''Route: «route.route»'''
	    val routeContent = '''«routeLabel»\n'''
	
	    val routeInfo = route.route + " " + route.routeStops.map[rs | rs.routestop].join(" ")
	    try {
	        val routesFile = new File("routes.txt")
	        if (!routesFile.exists()) {
	            routesFile.createNewFile()
	        }
	        Files.write(Paths.get("routes.txt"), (routeInfo + System.lineSeparator()).getBytes(), java.nio.file.StandardOpenOption.APPEND)
	    } catch (IOException e) {
	        e.printStackTrace()
	    }
	}
	
	def generateDelRoute(DelRoute delRoute,  IFileSystemAccess2 fsa) {
	    val route = delRoute.route
	    val routename = route.route
	    val routeName = routename.toString
	 
	    deleteEntry("routes.txt", routeName)
	 
	
	    return '''"DelRoute" [
	        label="Delete Route: «routeName»"
	    ];'''
	}
	
	def generateRouteStop(RouteStop routeStop, IFileSystemAccess2 fsa) {
	    val routeStopLabel = '''RouteStop: «routeStop.routestop»'''
	    val routeStopContent = '''«routeStopLabel»'''
	}
	 
	def generateBus(Bus bus,  IFileSystemAccess2 fsa) {
	    val busLabel = '''Bus: «bus.bus» Driven by «bus.driver» on Route «bus.route.route»'''
	    val busContent = '''«busLabel»'''
	
	    val busInfo = "Bus: " + bus.bus + " Driven by " + bus.driver + " on Route " + bus.route.route
	    try {
	        val busesFile = new File("buses.txt")
	        if (!busesFile.exists()) {
	            busesFile.createNewFile()
	        }
	        Files.write(Paths.get("buses.txt"), (busInfo + System.lineSeparator()).getBytes(), java.nio.file.StandardOpenOption.APPEND)
	    } catch (IOException e) {
	        // Handle file creation error
	        e.printStackTrace()
	    }
	}
	def generateStop(Stop stop,  IFileSystemAccess2 fsa) {
	    val location = stop.location
	    val stopLabel = '''Stop: «stop.stop» at Location «location.latitude», «location.longitude»'''
	    val stopContent = '''«stopLabel»'''
	
	    val stopInfo = "Stop: " + stop.stop + " at Location " + stop.location.latitude + ", " + stop.location.longitude
	    try {
	        val stopsFile = new File("stops.txt")
	        if (!stopsFile.exists()) {
	            stopsFile.createNewFile()
	        }
	        Files.write(Paths.get("stops.txt"), (stopInfo + System.lineSeparator()).getBytes(), java.nio.file.StandardOpenOption.APPEND)
	    } catch (IOException e) {
	        // Handle file creation error
	        e.printStackTrace()
	    }
	}
	
	def generateDelStop(DelStop delStop,  IFileSystemAccess2 fsa) {
	    val lines = Files.readAllLines(Paths.get("stops.txt"))
	 
	    val updatedLines = lines.filter[stop | !stop.startsWith(delStop.stop.stop)]
	 
	    val writer = new FileWriter("stops.txt")
	    val printWriter = new PrintWriter(writer)
	    updatedLines.forEach[printWriter.println(it)]
	    printWriter.close()
	
	    return '''"DelStop" [
	        label="Delete Stop: «delStop.stop.stop»"
	    ];'''
	}
	def generateAddRouteStop(AddRouteStop addRouteStop,  IFileSystemAccess2 fsa) {
	    val addRouteStopLabel = '''AddRouteStop: «addRouteStop.routeStop» to Route «addRouteStop.route.route»'''
	    val addRouteStopContent = '''«addRouteStopLabel»'''
	
	    val routeInfo = Files.readAllLines(Paths.get("routes.txt"))
	    val updatedRouteInfo = routeInfo.map[route |
	        if (route.startsWith(addRouteStop.route.route.toString)) {
	            route + " " + addRouteStop.routeStop
	        } else {
	            route
	        }
	    ]
	    Files.write(Paths.get("routes.txt"), updatedRouteInfo.join(System.lineSeparator()).getBytes())
	}
	
	def generateDeleteRouteStop(DeleteRouteStop deleteRouteStop,  IFileSystemAccess2 fsa) {
	    val deleteRouteStopLabel = '''DeleteRouteStop: «deleteRouteStop.routeStop» from Route «deleteRouteStop.route.route»'''
	    val deleteRouteStopContent = '''«deleteRouteStopLabel»'''
	
	    // Update routes.txt by removing the stop from the route
	    val routeInfo = Files.readAllLines(Paths.get("routes.txt"))
	    val updatedRouteInfo = routeInfo.map[route |
	        if (route.startsWith(deleteRouteStop.route.route.toString)) {
	            val stops = route.split(" ")
	            val updatedStops = stops.filter[stop | stop != deleteRouteStop.routeStop].join(" ")
	            deleteRouteStop.route.route + " " + updatedStops
	        } else {
	            route
	        }
	    ]
	    Files.write(Paths.get("routes.txt"), updatedRouteInfo.join(System.lineSeparator()).getBytes())
	}
	def generateDelBus(DelBus delBus,  IFileSystemAccess2 fsa) {
	    val busInfo = "Bus: " + delBus.bus.bus + " Driven by " + delBus.bus.driver + " on Route " + delBus.bus.route.route
	    deleteEntry("buses.txt", busInfo)
	 
	    return '''"DelBus" [
	        label="Delete Bus: «delBus.bus.bus»"
	    ];'''
	}
	def generatePrintRoute(PrintRoute printRoute,  IFileSystemAccess2 fsa) {
	    val routeName = printRoute.route.route
	 
	    val routeInfo = readFile("routes.txt")
	 
	    val routeDetails = routeInfo.findFirst[r | r.startsWith(routeName + " ")]
	 
	    val routeDescription = if (routeDetails != null) {
	        routeDetails.substring(routeName.toString.length + 1)
	    } else {
	        "No stops found for route «routeName»"
	    }
	
	    return '''"PrintRoute" [
	        label="Print Route: «routeName»\nRoute Stops:\n«routeDescription»"
	    ];'''
	}
	
	def startsWith(Object object, String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	def generatePrintBus(PrintBus printBus,  IFileSystemAccess2 fsa) {
	    val bus = printBus.bus
	 
	    val busInfo = readFile("buses.txt")
	 
	    val busDetails = findFirst(busInfo, "Bus:" + bus.bus)
	 
	    val label = if (busDetails != null) {
	        busDetails.replace("Bus: ", "Print Bus:\n")
	    } else {
	        "No information found for bus «bus.bus»"
	    }
	 
	    return '''"PrintBus" [
	        label="«label»"
	    ];'''
	}
	def generatePrintStop(PrintStop printStop,  IFileSystemAccess2 fsa) {
	    val stop = printStop.stop
	    val location = stop.location
	 
	    // Read information from stops.txt
	    val stopInfo = readFile("stops.txt")
	    val stopDetails = findFirst(stopInfo, "Stop:" + stop.stop)
	 
	    // Read information from routes.txt
	    val routesInfo = readFile("routes.txt")
	    val routesContainingStop = filter(routesInfo, stop.stop).map[line | line.toString.split(" ", 2).head].join(", ")
	 
	    val stopLabel = if (stopDetails != null) {
	        stopDetails.replace("Stop: ", "Print Stop:\n")
	    } else {
	        "No information found for stop «stop.stop»"
	    }
	 
	    val label = '''«stopLabel»
	        Location: Latitude: «location.latitude», Longitude: «location.longitude»
	        Routes Containing Stop: «routesContainingStop»'''
	 
	    return '''PrintStop [
	        label="«label»"
	    ];'''
	}
	
	def findFirst(List<String> lines, String searchString) {
    for (line : lines) {
        if (line.contains(searchString)) {
            return line
        }
    }
    return null // Return null if no matching line is found
}

	def <T> List<T> filter(List<T> lines, String searchString) {
	    val filteredList = newArrayList
	    for (element : lines) {
	        if (element.toString.contains(searchString)) {
	            filteredList.add(element)
	        }
	    }
	    return filteredList
	}
	
	def appendToFile(String filename, String content) {
       try {
           val file = new File(filename)
           if (!file.exists()) {
               file.createNewFile()
           }
           Files.write(Paths.get(filename), (content + System.lineSeparator()).getBytes(), java.nio.file.StandardOpenOption.APPEND)
       } catch (IOException e) {
           e.printStackTrace()
       }
   }

   def deleteEntry(String filename, String entry) {
       try {
           val file = new File(filename)
           if (file.exists()) {
               val lines = Files.readAllLines(Paths.get(filename))
               val updatedLines = lines.filter[it != entry]
               Files.write(Paths.get(filename), updatedLines, StandardCharsets.UTF_8)
           }

       } catch (IOException e) {
           e.printStackTrace()
       }

   }

   def List<String> readFile(String fileName) {
    try {
        return Files.readAllLines(Paths.get(fileName))
    } catch (IOException e) {
        e.printStackTrace()
        return newArrayList // return an empty list if an exception occurs
    }
}

   def writeFile(String filename, Iterable<String> content) {
       try {
           Files.write(Paths.get(filename), content.join(System.lineSeparator()).getBytes())
       } catch (IOException e) {
           e.printStackTrace()
       }
   }

}

