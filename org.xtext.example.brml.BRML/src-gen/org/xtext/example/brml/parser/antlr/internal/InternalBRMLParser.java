package org.xtext.example.brml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.brml.services.BRMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBRMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ADD STOP'", "'AT'", "'DELETE STOP'", "'ADD ROUTE'", "':'", "'ADD BUS'", "'DRIVEN BY'", "'ON ROUTE'", "'DELETE ROUTE'", "'DELETE BUS'", "'LOCATION'", "','", "'ADD ROUTE STOP'", "'TO'", "'DELETE ROUTE STOP'", "'FROM'", "'PRINT ROUTE'", "'PRINT BUS'", "'PRINT STOP'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBRMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBRMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBRMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBRML.g"; }



     	private BRMLGrammarAccess grammarAccess;

        public InternalBRMLParser(TokenStream input, BRMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BRMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBRML.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBRML.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBRML.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBRML.g:71:1: ruleModel returns [EObject current=null] : ( (lv_operations_0_0= ruleOperation ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalBRML.g:77:2: ( ( (lv_operations_0_0= ruleOperation ) )* )
            // InternalBRML.g:78:2: ( (lv_operations_0_0= ruleOperation ) )*
            {
            // InternalBRML.g:78:2: ( (lv_operations_0_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||LA1_0==16||(LA1_0>=19 && LA1_0<=20)||LA1_0==23||LA1_0==25||(LA1_0>=27 && LA1_0<=29)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBRML.g:79:3: (lv_operations_0_0= ruleOperation )
            	    {
            	    // InternalBRML.g:79:3: (lv_operations_0_0= ruleOperation )
            	    // InternalBRML.g:80:4: lv_operations_0_0= ruleOperation
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_operations_0_0=ruleOperation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"operations",
            	    					lv_operations_0_0,
            	    					"org.xtext.example.brml.BRML.Operation");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOperation"
    // InternalBRML.g:100:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalBRML.g:100:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalBRML.g:101:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalBRML.g:107:1: ruleOperation returns [EObject current=null] : (this_Route_0= ruleRoute | this_Bus_1= ruleBus | this_Stop_2= ruleStop | this_AddRouteStop_3= ruleAddRouteStop | this_DeleteRouteStop_4= ruleDeleteRouteStop | this_DelRoute_5= ruleDelRoute | this_DelBus_6= ruleDelBus | this_DelStop_7= ruleDelStop | this_PrintRoute_8= rulePrintRoute | this_PrintBus_9= rulePrintBus | this_PrintStop_10= rulePrintStop ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Route_0 = null;

        EObject this_Bus_1 = null;

        EObject this_Stop_2 = null;

        EObject this_AddRouteStop_3 = null;

        EObject this_DeleteRouteStop_4 = null;

        EObject this_DelRoute_5 = null;

        EObject this_DelBus_6 = null;

        EObject this_DelStop_7 = null;

        EObject this_PrintRoute_8 = null;

        EObject this_PrintBus_9 = null;

        EObject this_PrintStop_10 = null;



        	enterRule();

        try {
            // InternalBRML.g:113:2: ( (this_Route_0= ruleRoute | this_Bus_1= ruleBus | this_Stop_2= ruleStop | this_AddRouteStop_3= ruleAddRouteStop | this_DeleteRouteStop_4= ruleDeleteRouteStop | this_DelRoute_5= ruleDelRoute | this_DelBus_6= ruleDelBus | this_DelStop_7= ruleDelStop | this_PrintRoute_8= rulePrintRoute | this_PrintBus_9= rulePrintBus | this_PrintStop_10= rulePrintStop ) )
            // InternalBRML.g:114:2: (this_Route_0= ruleRoute | this_Bus_1= ruleBus | this_Stop_2= ruleStop | this_AddRouteStop_3= ruleAddRouteStop | this_DeleteRouteStop_4= ruleDeleteRouteStop | this_DelRoute_5= ruleDelRoute | this_DelBus_6= ruleDelBus | this_DelStop_7= ruleDelStop | this_PrintRoute_8= rulePrintRoute | this_PrintBus_9= rulePrintBus | this_PrintStop_10= rulePrintStop )
            {
            // InternalBRML.g:114:2: (this_Route_0= ruleRoute | this_Bus_1= ruleBus | this_Stop_2= ruleStop | this_AddRouteStop_3= ruleAddRouteStop | this_DeleteRouteStop_4= ruleDeleteRouteStop | this_DelRoute_5= ruleDelRoute | this_DelBus_6= ruleDelBus | this_DelStop_7= ruleDelStop | this_PrintRoute_8= rulePrintRoute | this_PrintBus_9= rulePrintBus | this_PrintStop_10= rulePrintStop )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 13:
                {
                alt2=8;
                }
                break;
            case 27:
                {
                alt2=9;
                }
                break;
            case 28:
                {
                alt2=10;
                }
                break;
            case 29:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBRML.g:115:3: this_Route_0= ruleRoute
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getRouteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Route_0=ruleRoute();

                    state._fsp--;


                    			current = this_Route_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBRML.g:124:3: this_Bus_1= ruleBus
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getBusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bus_1=ruleBus();

                    state._fsp--;


                    			current = this_Bus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBRML.g:133:3: this_Stop_2= ruleStop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getStopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stop_2=ruleStop();

                    state._fsp--;


                    			current = this_Stop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBRML.g:142:3: this_AddRouteStop_3= ruleAddRouteStop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getAddRouteStopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRouteStop_3=ruleAddRouteStop();

                    state._fsp--;


                    			current = this_AddRouteStop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBRML.g:151:3: this_DeleteRouteStop_4= ruleDeleteRouteStop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getDeleteRouteStopParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteRouteStop_4=ruleDeleteRouteStop();

                    state._fsp--;


                    			current = this_DeleteRouteStop_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBRML.g:160:3: this_DelRoute_5= ruleDelRoute
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getDelRouteParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelRoute_5=ruleDelRoute();

                    state._fsp--;


                    			current = this_DelRoute_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBRML.g:169:3: this_DelBus_6= ruleDelBus
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getDelBusParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelBus_6=ruleDelBus();

                    state._fsp--;


                    			current = this_DelBus_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBRML.g:178:3: this_DelStop_7= ruleDelStop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getDelStopParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelStop_7=ruleDelStop();

                    state._fsp--;


                    			current = this_DelStop_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBRML.g:187:3: this_PrintRoute_8= rulePrintRoute
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getPrintRouteParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintRoute_8=rulePrintRoute();

                    state._fsp--;


                    			current = this_PrintRoute_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalBRML.g:196:3: this_PrintBus_9= rulePrintBus
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getPrintBusParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintBus_9=rulePrintBus();

                    state._fsp--;


                    			current = this_PrintBus_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalBRML.g:205:3: this_PrintStop_10= rulePrintStop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getPrintStopParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintStop_10=rulePrintStop();

                    state._fsp--;


                    			current = this_PrintStop_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleStop"
    // InternalBRML.g:217:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalBRML.g:217:45: (iv_ruleStop= ruleStop EOF )
            // InternalBRML.g:218:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalBRML.g:224:1: ruleStop returns [EObject current=null] : (otherlv_0= 'ADD STOP' ( (lv_stop_1_0= RULE_STRING ) ) otherlv_2= 'AT' ( (lv_location_3_0= ruleLocation ) ) ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stop_1_0=null;
        Token otherlv_2=null;
        EObject lv_location_3_0 = null;



        	enterRule();

        try {
            // InternalBRML.g:230:2: ( (otherlv_0= 'ADD STOP' ( (lv_stop_1_0= RULE_STRING ) ) otherlv_2= 'AT' ( (lv_location_3_0= ruleLocation ) ) ) )
            // InternalBRML.g:231:2: (otherlv_0= 'ADD STOP' ( (lv_stop_1_0= RULE_STRING ) ) otherlv_2= 'AT' ( (lv_location_3_0= ruleLocation ) ) )
            {
            // InternalBRML.g:231:2: (otherlv_0= 'ADD STOP' ( (lv_stop_1_0= RULE_STRING ) ) otherlv_2= 'AT' ( (lv_location_3_0= ruleLocation ) ) )
            // InternalBRML.g:232:3: otherlv_0= 'ADD STOP' ( (lv_stop_1_0= RULE_STRING ) ) otherlv_2= 'AT' ( (lv_location_3_0= ruleLocation ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getADDSTOPKeyword_0());
            		
            // InternalBRML.g:236:3: ( (lv_stop_1_0= RULE_STRING ) )
            // InternalBRML.g:237:4: (lv_stop_1_0= RULE_STRING )
            {
            // InternalBRML.g:237:4: (lv_stop_1_0= RULE_STRING )
            // InternalBRML.g:238:5: lv_stop_1_0= RULE_STRING
            {
            lv_stop_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_stop_1_0, grammarAccess.getStopAccess().getStopSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stop",
            						lv_stop_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStopAccess().getATKeyword_2());
            		
            // InternalBRML.g:258:3: ( (lv_location_3_0= ruleLocation ) )
            // InternalBRML.g:259:4: (lv_location_3_0= ruleLocation )
            {
            // InternalBRML.g:259:4: (lv_location_3_0= ruleLocation )
            // InternalBRML.g:260:5: lv_location_3_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getStopAccess().getLocationLocationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_3_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStopRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_3_0,
            						"org.xtext.example.brml.BRML.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleDelStop"
    // InternalBRML.g:281:1: entryRuleDelStop returns [EObject current=null] : iv_ruleDelStop= ruleDelStop EOF ;
    public final EObject entryRuleDelStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelStop = null;


        try {
            // InternalBRML.g:281:48: (iv_ruleDelStop= ruleDelStop EOF )
            // InternalBRML.g:282:2: iv_ruleDelStop= ruleDelStop EOF
            {
             newCompositeNode(grammarAccess.getDelStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelStop=ruleDelStop();

            state._fsp--;

             current =iv_ruleDelStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelStop"


    // $ANTLR start "ruleDelStop"
    // InternalBRML.g:288:1: ruleDelStop returns [EObject current=null] : (otherlv_0= 'DELETE STOP' ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleDelStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBRML.g:294:2: ( (otherlv_0= 'DELETE STOP' ( (otherlv_1= RULE_STRING ) ) ) )
            // InternalBRML.g:295:2: (otherlv_0= 'DELETE STOP' ( (otherlv_1= RULE_STRING ) ) )
            {
            // InternalBRML.g:295:2: (otherlv_0= 'DELETE STOP' ( (otherlv_1= RULE_STRING ) ) )
            // InternalBRML.g:296:3: otherlv_0= 'DELETE STOP' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDelStopAccess().getDELETESTOPKeyword_0());
            		
            // InternalBRML.g:300:3: ( (otherlv_1= RULE_STRING ) )
            // InternalBRML.g:301:4: (otherlv_1= RULE_STRING )
            {
            // InternalBRML.g:301:4: (otherlv_1= RULE_STRING )
            // InternalBRML.g:302:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelStopRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDelStopAccess().getStopStopCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelStop"


    // $ANTLR start "entryRuleRoute"
    // InternalBRML.g:317:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalBRML.g:317:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalBRML.g:318:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalBRML.g:324:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'ADD ROUTE' ( (lv_route_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_routeStops_3_0= ruleRouteStop ) )+ ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_route_1_0=null;
        Token otherlv_2=null;
        EObject lv_routeStops_3_0 = null;



        	enterRule();

        try {
            // InternalBRML.g:330:2: ( (otherlv_0= 'ADD ROUTE' ( (lv_route_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_routeStops_3_0= ruleRouteStop ) )+ ) )
            // InternalBRML.g:331:2: (otherlv_0= 'ADD ROUTE' ( (lv_route_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_routeStops_3_0= ruleRouteStop ) )+ )
            {
            // InternalBRML.g:331:2: (otherlv_0= 'ADD ROUTE' ( (lv_route_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_routeStops_3_0= ruleRouteStop ) )+ )
            // InternalBRML.g:332:3: otherlv_0= 'ADD ROUTE' ( (lv_route_1_0= RULE_INT ) ) otherlv_2= ':' ( (lv_routeStops_3_0= ruleRouteStop ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getADDROUTEKeyword_0());
            		
            // InternalBRML.g:336:3: ( (lv_route_1_0= RULE_INT ) )
            // InternalBRML.g:337:4: (lv_route_1_0= RULE_INT )
            {
            // InternalBRML.g:337:4: (lv_route_1_0= RULE_INT )
            // InternalBRML.g:338:5: lv_route_1_0= RULE_INT
            {
            lv_route_1_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_route_1_0, grammarAccess.getRouteAccess().getRouteINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"route",
            						lv_route_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getColonKeyword_2());
            		
            // InternalBRML.g:358:3: ( (lv_routeStops_3_0= ruleRouteStop ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBRML.g:359:4: (lv_routeStops_3_0= ruleRouteStop )
            	    {
            	    // InternalBRML.g:359:4: (lv_routeStops_3_0= ruleRouteStop )
            	    // InternalBRML.g:360:5: lv_routeStops_3_0= ruleRouteStop
            	    {

            	    					newCompositeNode(grammarAccess.getRouteAccess().getRouteStopsRouteStopParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_routeStops_3_0=ruleRouteStop();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRouteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"routeStops",
            	    						lv_routeStops_3_0,
            	    						"org.xtext.example.brml.BRML.RouteStop");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleRouteStop"
    // InternalBRML.g:381:1: entryRuleRouteStop returns [EObject current=null] : iv_ruleRouteStop= ruleRouteStop EOF ;
    public final EObject entryRuleRouteStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRouteStop = null;


        try {
            // InternalBRML.g:381:50: (iv_ruleRouteStop= ruleRouteStop EOF )
            // InternalBRML.g:382:2: iv_ruleRouteStop= ruleRouteStop EOF
            {
             newCompositeNode(grammarAccess.getRouteStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRouteStop=ruleRouteStop();

            state._fsp--;

             current =iv_ruleRouteStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRouteStop"


    // $ANTLR start "ruleRouteStop"
    // InternalBRML.g:388:1: ruleRouteStop returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleRouteStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBRML.g:394:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalBRML.g:395:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalBRML.g:395:2: ( (otherlv_0= RULE_STRING ) )
            // InternalBRML.g:396:3: (otherlv_0= RULE_STRING )
            {
            // InternalBRML.g:396:3: (otherlv_0= RULE_STRING )
            // InternalBRML.g:397:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRouteStopRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRouteStopAccess().getRoutestopStopCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRouteStop"


    // $ANTLR start "entryRuleBus"
    // InternalBRML.g:411:1: entryRuleBus returns [EObject current=null] : iv_ruleBus= ruleBus EOF ;
    public final EObject entryRuleBus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBus = null;


        try {
            // InternalBRML.g:411:44: (iv_ruleBus= ruleBus EOF )
            // InternalBRML.g:412:2: iv_ruleBus= ruleBus EOF
            {
             newCompositeNode(grammarAccess.getBusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBus=ruleBus();

            state._fsp--;

             current =iv_ruleBus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBus"


    // $ANTLR start "ruleBus"
    // InternalBRML.g:418:1: ruleBus returns [EObject current=null] : (otherlv_0= 'ADD BUS' ( (lv_bus_1_0= RULE_STRING ) ) otherlv_2= 'DRIVEN BY' ( (lv_driver_3_0= RULE_STRING ) ) otherlv_4= 'ON ROUTE' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleBus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bus_1_0=null;
        Token otherlv_2=null;
        Token lv_driver_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBRML.g:424:2: ( (otherlv_0= 'ADD BUS' ( (lv_bus_1_0= RULE_STRING ) ) otherlv_2= 'DRIVEN BY' ( (lv_driver_3_0= RULE_STRING ) ) otherlv_4= 'ON ROUTE' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalBRML.g:425:2: (otherlv_0= 'ADD BUS' ( (lv_bus_1_0= RULE_STRING ) ) otherlv_2= 'DRIVEN BY' ( (lv_driver_3_0= RULE_STRING ) ) otherlv_4= 'ON ROUTE' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalBRML.g:425:2: (otherlv_0= 'ADD BUS' ( (lv_bus_1_0= RULE_STRING ) ) otherlv_2= 'DRIVEN BY' ( (lv_driver_3_0= RULE_STRING ) ) otherlv_4= 'ON ROUTE' ( (otherlv_5= RULE_ID ) ) )
            // InternalBRML.g:426:3: otherlv_0= 'ADD BUS' ( (lv_bus_1_0= RULE_STRING ) ) otherlv_2= 'DRIVEN BY' ( (lv_driver_3_0= RULE_STRING ) ) otherlv_4= 'ON ROUTE' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBusAccess().getADDBUSKeyword_0());
            		
            // InternalBRML.g:430:3: ( (lv_bus_1_0= RULE_STRING ) )
            // InternalBRML.g:431:4: (lv_bus_1_0= RULE_STRING )
            {
            // InternalBRML.g:431:4: (lv_bus_1_0= RULE_STRING )
            // InternalBRML.g:432:5: lv_bus_1_0= RULE_STRING
            {
            lv_bus_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_bus_1_0, grammarAccess.getBusAccess().getBusSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bus",
            						lv_bus_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBusAccess().getDRIVENBYKeyword_2());
            		
            // InternalBRML.g:452:3: ( (lv_driver_3_0= RULE_STRING ) )
            // InternalBRML.g:453:4: (lv_driver_3_0= RULE_STRING )
            {
            // InternalBRML.g:453:4: (lv_driver_3_0= RULE_STRING )
            // InternalBRML.g:454:5: lv_driver_3_0= RULE_STRING
            {
            lv_driver_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_driver_3_0, grammarAccess.getBusAccess().getDriverSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"driver",
            						lv_driver_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getBusAccess().getONROUTEKeyword_4());
            		
            // InternalBRML.g:474:3: ( (otherlv_5= RULE_ID ) )
            // InternalBRML.g:475:4: (otherlv_5= RULE_ID )
            {
            // InternalBRML.g:475:4: (otherlv_5= RULE_ID )
            // InternalBRML.g:476:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBusRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getBusAccess().getRouteRouteCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBus"


    // $ANTLR start "entryRuleDelRoute"
    // InternalBRML.g:491:1: entryRuleDelRoute returns [EObject current=null] : iv_ruleDelRoute= ruleDelRoute EOF ;
    public final EObject entryRuleDelRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelRoute = null;


        try {
            // InternalBRML.g:491:49: (iv_ruleDelRoute= ruleDelRoute EOF )
            // InternalBRML.g:492:2: iv_ruleDelRoute= ruleDelRoute EOF
            {
             newCompositeNode(grammarAccess.getDelRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelRoute=ruleDelRoute();

            state._fsp--;

             current =iv_ruleDelRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelRoute"


    // $ANTLR start "ruleDelRoute"
    // InternalBRML.g:498:1: ruleDelRoute returns [EObject current=null] : (otherlv_0= 'DELETE ROUTE' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDelRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBRML.g:504:2: ( (otherlv_0= 'DELETE ROUTE' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBRML.g:505:2: (otherlv_0= 'DELETE ROUTE' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBRML.g:505:2: (otherlv_0= 'DELETE ROUTE' ( (otherlv_1= RULE_ID ) ) )
            // InternalBRML.g:506:3: otherlv_0= 'DELETE ROUTE' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDelRouteAccess().getDELETEROUTEKeyword_0());
            		
            // InternalBRML.g:510:3: ( (otherlv_1= RULE_ID ) )
            // InternalBRML.g:511:4: (otherlv_1= RULE_ID )
            {
            // InternalBRML.g:511:4: (otherlv_1= RULE_ID )
            // InternalBRML.g:512:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelRouteRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDelRouteAccess().getRouteRouteCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelRoute"


    // $ANTLR start "entryRuleDelBus"
    // InternalBRML.g:527:1: entryRuleDelBus returns [EObject current=null] : iv_ruleDelBus= ruleDelBus EOF ;
    public final EObject entryRuleDelBus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelBus = null;


        try {
            // InternalBRML.g:527:47: (iv_ruleDelBus= ruleDelBus EOF )
            // InternalBRML.g:528:2: iv_ruleDelBus= ruleDelBus EOF
            {
             newCompositeNode(grammarAccess.getDelBusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelBus=ruleDelBus();

            state._fsp--;

             current =iv_ruleDelBus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelBus"


    // $ANTLR start "ruleDelBus"
    // InternalBRML.g:534:1: ruleDelBus returns [EObject current=null] : (otherlv_0= 'DELETE BUS' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleDelBus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBRML.g:540:2: ( (otherlv_0= 'DELETE BUS' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // InternalBRML.g:541:2: (otherlv_0= 'DELETE BUS' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // InternalBRML.g:541:2: (otherlv_0= 'DELETE BUS' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) ) )
            // InternalBRML.g:542:3: otherlv_0= 'DELETE BUS' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDelBusAccess().getDELETEBUSKeyword_0());
            		
            // InternalBRML.g:546:3: ( (otherlv_1= RULE_ID ) )
            // InternalBRML.g:547:4: (otherlv_1= RULE_ID )
            {
            // InternalBRML.g:547:4: (otherlv_1= RULE_ID )
            // InternalBRML.g:548:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelBusRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getDelBusAccess().getBusBusCrossReference_1_0());
            				

            }


            }

            // InternalBRML.g:559:3: ( (otherlv_2= RULE_STRING ) )
            // InternalBRML.g:560:4: (otherlv_2= RULE_STRING )
            {
            // InternalBRML.g:560:4: (otherlv_2= RULE_STRING )
            // InternalBRML.g:561:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelBusRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDelBusAccess().getBusBusCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelBus"


    // $ANTLR start "entryRuleLocation"
    // InternalBRML.g:576:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalBRML.g:576:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalBRML.g:577:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalBRML.g:583:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'LOCATION' ( (lv_latitude_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_longitude_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_latitude_1_0=null;
        Token otherlv_2=null;
        Token lv_longitude_3_0=null;


        	enterRule();

        try {
            // InternalBRML.g:589:2: ( (otherlv_0= 'LOCATION' ( (lv_latitude_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_longitude_3_0= RULE_STRING ) ) ) )
            // InternalBRML.g:590:2: (otherlv_0= 'LOCATION' ( (lv_latitude_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_longitude_3_0= RULE_STRING ) ) )
            {
            // InternalBRML.g:590:2: (otherlv_0= 'LOCATION' ( (lv_latitude_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_longitude_3_0= RULE_STRING ) ) )
            // InternalBRML.g:591:3: otherlv_0= 'LOCATION' ( (lv_latitude_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_longitude_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLOCATIONKeyword_0());
            		
            // InternalBRML.g:595:3: ( (lv_latitude_1_0= RULE_STRING ) )
            // InternalBRML.g:596:4: (lv_latitude_1_0= RULE_STRING )
            {
            // InternalBRML.g:596:4: (lv_latitude_1_0= RULE_STRING )
            // InternalBRML.g:597:5: lv_latitude_1_0= RULE_STRING
            {
            lv_latitude_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_latitude_1_0, grammarAccess.getLocationAccess().getLatitudeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"latitude",
            						lv_latitude_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getCommaKeyword_2());
            		
            // InternalBRML.g:617:3: ( (lv_longitude_3_0= RULE_STRING ) )
            // InternalBRML.g:618:4: (lv_longitude_3_0= RULE_STRING )
            {
            // InternalBRML.g:618:4: (lv_longitude_3_0= RULE_STRING )
            // InternalBRML.g:619:5: lv_longitude_3_0= RULE_STRING
            {
            lv_longitude_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_longitude_3_0, grammarAccess.getLocationAccess().getLongitudeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"longitude",
            						lv_longitude_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleAddRouteStop"
    // InternalBRML.g:639:1: entryRuleAddRouteStop returns [EObject current=null] : iv_ruleAddRouteStop= ruleAddRouteStop EOF ;
    public final EObject entryRuleAddRouteStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRouteStop = null;


        try {
            // InternalBRML.g:639:53: (iv_ruleAddRouteStop= ruleAddRouteStop EOF )
            // InternalBRML.g:640:2: iv_ruleAddRouteStop= ruleAddRouteStop EOF
            {
             newCompositeNode(grammarAccess.getAddRouteStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddRouteStop=ruleAddRouteStop();

            state._fsp--;

             current =iv_ruleAddRouteStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddRouteStop"


    // $ANTLR start "ruleAddRouteStop"
    // InternalBRML.g:646:1: ruleAddRouteStop returns [EObject current=null] : (otherlv_0= 'ADD ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'TO' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAddRouteStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBRML.g:652:2: ( (otherlv_0= 'ADD ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'TO' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBRML.g:653:2: (otherlv_0= 'ADD ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'TO' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBRML.g:653:2: (otherlv_0= 'ADD ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'TO' ( (otherlv_3= RULE_ID ) ) )
            // InternalBRML.g:654:3: otherlv_0= 'ADD ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'TO' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAddRouteStopAccess().getADDROUTESTOPKeyword_0());
            		
            // InternalBRML.g:658:3: ( (otherlv_1= RULE_ID ) )
            // InternalBRML.g:659:4: (otherlv_1= RULE_ID )
            {
            // InternalBRML.g:659:4: (otherlv_1= RULE_ID )
            // InternalBRML.g:660:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRouteStopRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getAddRouteStopAccess().getRouteStopStopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAddRouteStopAccess().getTOKeyword_2());
            		
            // InternalBRML.g:675:3: ( (otherlv_3= RULE_ID ) )
            // InternalBRML.g:676:4: (otherlv_3= RULE_ID )
            {
            // InternalBRML.g:676:4: (otherlv_3= RULE_ID )
            // InternalBRML.g:677:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRouteStopRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getAddRouteStopAccess().getRouteRouteCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddRouteStop"


    // $ANTLR start "entryRuleDeleteRouteStop"
    // InternalBRML.g:692:1: entryRuleDeleteRouteStop returns [EObject current=null] : iv_ruleDeleteRouteStop= ruleDeleteRouteStop EOF ;
    public final EObject entryRuleDeleteRouteStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteRouteStop = null;


        try {
            // InternalBRML.g:692:56: (iv_ruleDeleteRouteStop= ruleDeleteRouteStop EOF )
            // InternalBRML.g:693:2: iv_ruleDeleteRouteStop= ruleDeleteRouteStop EOF
            {
             newCompositeNode(grammarAccess.getDeleteRouteStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteRouteStop=ruleDeleteRouteStop();

            state._fsp--;

             current =iv_ruleDeleteRouteStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteRouteStop"


    // $ANTLR start "ruleDeleteRouteStop"
    // InternalBRML.g:699:1: ruleDeleteRouteStop returns [EObject current=null] : (otherlv_0= 'DELETE ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDeleteRouteStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBRML.g:705:2: ( (otherlv_0= 'DELETE ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBRML.g:706:2: (otherlv_0= 'DELETE ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBRML.g:706:2: (otherlv_0= 'DELETE ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) ) )
            // InternalBRML.g:707:3: otherlv_0= 'DELETE ROUTE STOP' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'FROM' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteRouteStopAccess().getDELETEROUTESTOPKeyword_0());
            		
            // InternalBRML.g:711:3: ( (otherlv_1= RULE_ID ) )
            // InternalBRML.g:712:4: (otherlv_1= RULE_ID )
            {
            // InternalBRML.g:712:4: (otherlv_1= RULE_ID )
            // InternalBRML.g:713:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRouteStopRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getDeleteRouteStopAccess().getRouteStopStopCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteRouteStopAccess().getFROMKeyword_2());
            		
            // InternalBRML.g:728:3: ( (otherlv_3= RULE_ID ) )
            // InternalBRML.g:729:4: (otherlv_3= RULE_ID )
            {
            // InternalBRML.g:729:4: (otherlv_3= RULE_ID )
            // InternalBRML.g:730:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRouteStopRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getDeleteRouteStopAccess().getRouteRouteCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteRouteStop"


    // $ANTLR start "entryRulePrintRoute"
    // InternalBRML.g:745:1: entryRulePrintRoute returns [EObject current=null] : iv_rulePrintRoute= rulePrintRoute EOF ;
    public final EObject entryRulePrintRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintRoute = null;


        try {
            // InternalBRML.g:745:51: (iv_rulePrintRoute= rulePrintRoute EOF )
            // InternalBRML.g:746:2: iv_rulePrintRoute= rulePrintRoute EOF
            {
             newCompositeNode(grammarAccess.getPrintRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintRoute=rulePrintRoute();

            state._fsp--;

             current =iv_rulePrintRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintRoute"


    // $ANTLR start "rulePrintRoute"
    // InternalBRML.g:752:1: rulePrintRoute returns [EObject current=null] : (otherlv_0= 'PRINT ROUTE' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePrintRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBRML.g:758:2: ( (otherlv_0= 'PRINT ROUTE' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBRML.g:759:2: (otherlv_0= 'PRINT ROUTE' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBRML.g:759:2: (otherlv_0= 'PRINT ROUTE' ( (otherlv_1= RULE_ID ) ) )
            // InternalBRML.g:760:3: otherlv_0= 'PRINT ROUTE' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintRouteAccess().getPRINTROUTEKeyword_0());
            		
            // InternalBRML.g:764:3: ( (otherlv_1= RULE_ID ) )
            // InternalBRML.g:765:4: (otherlv_1= RULE_ID )
            {
            // InternalBRML.g:765:4: (otherlv_1= RULE_ID )
            // InternalBRML.g:766:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintRouteRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPrintRouteAccess().getRouteRouteCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintRoute"


    // $ANTLR start "entryRulePrintBus"
    // InternalBRML.g:781:1: entryRulePrintBus returns [EObject current=null] : iv_rulePrintBus= rulePrintBus EOF ;
    public final EObject entryRulePrintBus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintBus = null;


        try {
            // InternalBRML.g:781:49: (iv_rulePrintBus= rulePrintBus EOF )
            // InternalBRML.g:782:2: iv_rulePrintBus= rulePrintBus EOF
            {
             newCompositeNode(grammarAccess.getPrintBusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintBus=rulePrintBus();

            state._fsp--;

             current =iv_rulePrintBus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintBus"


    // $ANTLR start "rulePrintBus"
    // InternalBRML.g:788:1: rulePrintBus returns [EObject current=null] : (otherlv_0= 'PRINT BUS' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePrintBus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBRML.g:794:2: ( (otherlv_0= 'PRINT BUS' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBRML.g:795:2: (otherlv_0= 'PRINT BUS' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBRML.g:795:2: (otherlv_0= 'PRINT BUS' ( (otherlv_1= RULE_ID ) ) )
            // InternalBRML.g:796:3: otherlv_0= 'PRINT BUS' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintBusAccess().getPRINTBUSKeyword_0());
            		
            // InternalBRML.g:800:3: ( (otherlv_1= RULE_ID ) )
            // InternalBRML.g:801:4: (otherlv_1= RULE_ID )
            {
            // InternalBRML.g:801:4: (otherlv_1= RULE_ID )
            // InternalBRML.g:802:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintBusRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPrintBusAccess().getBusBusCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintBus"


    // $ANTLR start "entryRulePrintStop"
    // InternalBRML.g:817:1: entryRulePrintStop returns [EObject current=null] : iv_rulePrintStop= rulePrintStop EOF ;
    public final EObject entryRulePrintStop() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStop = null;


        try {
            // InternalBRML.g:817:50: (iv_rulePrintStop= rulePrintStop EOF )
            // InternalBRML.g:818:2: iv_rulePrintStop= rulePrintStop EOF
            {
             newCompositeNode(grammarAccess.getPrintStopRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintStop=rulePrintStop();

            state._fsp--;

             current =iv_rulePrintStop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintStop"


    // $ANTLR start "rulePrintStop"
    // InternalBRML.g:824:1: rulePrintStop returns [EObject current=null] : (otherlv_0= 'PRINT STOP' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePrintStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBRML.g:830:2: ( (otherlv_0= 'PRINT STOP' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBRML.g:831:2: (otherlv_0= 'PRINT STOP' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBRML.g:831:2: (otherlv_0= 'PRINT STOP' ( (otherlv_1= RULE_ID ) ) )
            // InternalBRML.g:832:3: otherlv_0= 'PRINT STOP' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintStopAccess().getPRINTSTOPKeyword_0());
            		
            // InternalBRML.g:836:3: ( (otherlv_1= RULE_ID ) )
            // InternalBRML.g:837:4: (otherlv_1= RULE_ID )
            {
            // InternalBRML.g:837:4: (otherlv_1= RULE_ID )
            // InternalBRML.g:838:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintStopRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPrintStopAccess().getStopStopCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintStop"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000003A996802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}