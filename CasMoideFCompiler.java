package CasMoideFCompiler;
/*
 *Developer:Student ZHU
 *junior school student
 *starting time:2022-10-10 
 *version 1.4.7 
 */
import java.io.*;
import java.util.*;

public class CasMoideFCompiler {
	public static BufferedReader bu,bu2,bu3;
	public static int number,zapol,num,num2;
	public static Scanner sc,sc2;
	public static String infas,inp5;
	public static int mtc;
	public static File file; 
	public static int racd,ina;
	public static String adi,adi2,adi3,out,in;
	public static String iut,iut2,iut3,iut4,iut5,iut6,iut7;
	public static BufferedWriter buw;
	public static BufferedReader bur;
	public static Stack<String> scb;
	public static Stack<Integer> scb2;
	public static char[] valuep;
	public static boolean a = false;
	public static List<String> list  = new ArrayList<String>();
	@SuppressWarnings("unused")
	public void CasMoideFCompiler$() {
		while(true) {
	        sc = new Scanner(System.in);
	        String sct = sc.nextLine();
	        String sct2 = null;
	        char[] sct3 = sct.toCharArray();
	        char[] str2;
			char[] strs;
	        boolean bool = false,bool2 = false,boolp = false;
	        String inp1,inp2 = null,inp3,inp4;
	        String stack,smstack;
	        String stcf2;
	        String inputs = null;
	        //System.out.println(System.getProperty("user.dir"));
	        
	        if(sct.length() >= 13) {
	          if(sct.substring(0,13).equals("CMF - version")) {
	        	 System.err.println("version 1-4-7"); 
	          }
	        }
	        
	        if(sct.length() >= 9) {
	        if(sct.substring(0,9).equals("CMF.make ") && 
	           sct.substring(9,sct3.length).endsWith("CMF")) {
	           Map<String,String> map = new LinkedHashMap<String,String>();
	           Map<String,String> map2 = new LinkedHashMap<String,String>();
	           Map<String,String> map3 = new LinkedHashMap<String,String>();
	   /*可调用函数变量存储*/Map<String,String> map4 = new LinkedHashMap<String,String>();
	           Set<String> keys = map.keySet();
	           //System.out.println("ok1");	
	           sct2 = sct.substring(9,sct3.length);
               num = 0;
	        	try {
				    bu = new BufferedReader(new InputStreamReader(new FileInputStream(sct2),"UTF-8"));
					for(String str = null; (str = bu.readLine()) != null;){
						str2 = str.toCharArray();
						if(str2.length>=21) {
						if(str.substring(0,21).equals("import CMF.Abtus main") && 
						   str.substring(str2.length-1,str2.length).equals("{")) {
							//System.out.println("ok2");
						   bool = true;
						}//CMF.make G:\putio.CMF
						}
						if(str.equals("}")) {
				   	    bool2 = true;
					    }
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	if(bool == true && bool2 == true) {	
	        		//System.out.println("ok3");/
	        		try {
	        			bu2 = new BufferedReader(new InputStreamReader(new FileInputStream(sct2),"UTF-8"));
						//System.out.println("fdngbFwgVNFJBJNVG");	
	        			for(String stre = null; (stre = bu2.readLine()) != null;){
						num++;
						a=false;
						if(stre.toCharArray().length>=21) {
							if(stre.substring(0,21).equals("import CMF.Abtus main") && 
							   stre.substring(stre.toCharArray().length-1,stre.toCharArray().length).equals("{")) {
								//System.out.println("ok2");
							   bool = true;
							   a=true;
							}//CMF.make G:\putio.CMF
							}
							if(stre.equals("}")) {
					   	    bool2 = true;
					   	    a=true;
						    }
	        				strs = stre.toCharArray();
							if(strs.length>=8) {
								if(stre.substring(0,8).equals("io.put('") &&
								   stre.substring(strs.length-2,strs.length).equals("')")
								   && bool==true && bool2 == true) {
								   inp1 = stre.substring(8,strs.length-2);
								   System.out.println(inp1);
								   a=true;
								}
								if(stre.substring(0,7).equals("String ")) {
									for(int ra = 0;ra<strs.length;ra++) {
									    if(strs[ra] == 'l' && strs[ra+1] == 'e'
								    	&& strs[ra+2] == 'b' && strs[ra+3] == '('
								    	&& strs[ra+4] == 's' && strs[ra+5] == 'o'
								    	&& strs[ra+6] == 'm' && strs[ra+7] == 'e'
								    	&& strs[ra+8] == ')' && strs[ra-1] == ' '
									    && strs[ra-2] == '=' && strs[ra-3] == ' '
									    && stre.substring(strs.length-8,strs.length).equals("String()")) {
									    inp5 = stre.substring(7,ra-3); 
										//System.out.println("sdftgyh");   
									    a=true;
									    }
									    if(strs[ra] == ' ' && strs[ra+1] == '='
									       && strs[ra+2] == ' ' && strs[ra+3] == '"') {
									       inputs = stre.substring(ra+4,strs.length-1);
									       inp5 = stre.substring(7,ra);
									       infas=inp5;
									       map2.put(infas,inputs);
									       a=true;
									    }
									   }
									map.put(inp5, "String");
								}
								
								if(stre.substring(0,9).equals("solmiary ")) {
								   for(int ra = 0;ra<strs.length;ra++) {										   
									   if(strs[ra] == 'l' && strs[ra+1] == 'e'
										  && strs[ra+2] == 'b' && strs[ra+3] == '('
										  && strs[ra+4] == 's' && strs[ra+5] == 'o'
										  && strs[ra+6] == 'm' && strs[ra+7] == 'e'
										  && strs[ra+8] == ')' && strs[ra-1] == ' '
										  && strs[ra-2] == '=' && strs[ra-3] == ' '
									      && stre.substring(strs.length-10,strs.length).equals("solmiary()")) {
	    							      inp5 = stre.substring(9,ra-3); 
										}											
									   if(strs[ra] == ' ' && strs[ra+1] == '='
										  && strs[ra+2] == ' ') {
										  inputs = stre.substring(ra+3,strs.length);
										  inp5 = stre.substring(9,ra);
										  //System.out.println(inputs);
										  Integer in = Integer.valueOf(inputs);
										  map2.put(inp5,inputs);
										  a=true;
									   }
									}
								map.put(inp5,"int");
								}
								
								if(stre.substring(0,9).equals("KeyInput ") && 
								   stre.substring(strs.length-10,strs.length).equals("KeyInput()")) {
								   for(int ra = 0;ra<strs.length;ra++) {
					     		   if(strs[ra] == 'l' && strs[ra+1] == 'e'
						    	   && strs[ra+2] == 'b' && strs[ra+3] == '('
						    	   && strs[ra+4] == 's' && strs[ra+5] == 'o'
						       	   && strs[ra+6] == 'm' && strs[ra+7] == 'e'
								   && strs[ra+8] == ')' && strs[ra-1] == ' '
							       && strs[ra-2] == '=' && strs[ra-3] == ' ') {
					    		   inp4 = stre.substring(9,ra-3); 
					    		   //System.out.println(inp4);
								   map.put(inp4,"Scanner");
								   sc2 = new Scanner(System.in);
								   a=true;
											   }
										   }
										}
								
								if(stre.substring(stre.length()-6,stre.length()).equals(").read")) {
									for(int ra = 0;ra<stre.length();ra++) {
										if(strs[ra] == '.' && strs[ra+1] == 'g'
										   && strs[ra+2] == 'e' && strs[ra+3] == 't'
										   && strs[ra+4] == '(') {
										   String stcf = stre.substring(ra+5,stre.length()-6);
										   stcf2 = stre.substring(0,ra);
										   String value = map.get(stcf);
										   String value2 = map.get(stcf2);
										   if(value != null&&value2 !=null && value.equals("Scanner")&&value2.equals("String")) {   
										   stack = sc2.nextLine();
										   infas=stcf2;
										   map2.put(infas,stack);
										   a=true;
										}else {
											System.err.println("The possibility of an exception is:");
			                            	   System.err.println("Null variable exception ---> "+stre);
			                            	   System.err.println("Type are not compatible ---> "+stre);
			                            	   System.err.println("Grammar mistakes ---> "+stre);
			                            	   System.err.println("Line ---> "+num);	
										}
										}
									}
								}
								
								infas=null;
								
								if(stre.substring(0,5).equals("FILE ")) {
								   //System.out.println("FILE OK1");
									for(int ra = 0;ra<stre.length();ra++) {
									   if(strs[ra] == 'l' && strs[ra+1] == 'e'
									   && strs[ra+2] == 'b' && strs[ra+3] == '('
									   && strs[ra+4] == 's' && strs[ra+5] == 'y'
									   && strs[ra+6] == 't' && strs[ra+7] == 's'
								       && strs[ra+8] == ')' && strs[ra-1] == ' '
									   && strs[ra-2] == '=' && strs[ra-3] == ' ') {
									   //System.out.println("FILE OK2");	   
									   
									   if(stre.substring(stre.length()-6,stre.length()).equals("FILE()")) {
									   inp5 = stre.substring(5,ra-3);
									   a=true;
									   }
									   if(!stre.substring(stre.length()-6,stre.length()).equals("FILE()")) {
										  //System.out.println("setf???");
										  for(int ra2 = 0;ra2<stre.length();ra2++) {
										  /*
											  if(strs[ra2] == '(') {
											 System.out.println(strs[ra2+1]+"------"+strs[stre.length()-2]); 
										  }
										  */
										  if(strs[ra2] == '('&&strs[ra2-1] == 'E'&&strs[ra2-2] == 'L'&&strs[ra2-3] == 'I'
										  &&strs[ra2-4] == 'F'&&strs[ra2+1] == '"'&&strs[stre.length()-2] == '"'){
										  //System.out.println("FILE OK3");
										  inp5 = stre.substring(5,ra-3);
										  inputs = stre.substring(ra2+2,stre.length()-2);
										  map2.put(inp5,inputs);
										  a=true;
										  //System.out.println(inp5+"------"+inputs);
									   }
										  if(strs[ra2] == '('&&strs[ra2-1] == 'E'&&strs[ra2-2] == 'L'&&strs[ra2-3] == 'I'
										  &&strs[ra2-4] == 'F'&&strs[ra2+1] != '"'&&strs[stre.length()-2] != '"') {
											inp5 = stre.substring(5,ra-3);
											String bsw = stre.substring(ra2+1,stre.length()-1);  
											String bsw2 = map2.get(bsw);
											map2.put(inp5,bsw2);
											a=true;
										  }
										  }
									   }
									   }
								   }
								   map.put(inp5,"FILE");
								}
								
								if(stre.substring(0,5).equals("FILE.")) {
								   if(stre.substring(5,18).equals("outSpackfile(")){
									  String filetcf = stre.substring(18,stre.length()-1);
									  String value = map.get(filetcf);
									  String value2 = map2.get(filetcf);
									  try {
									  if(value.equals("FILE")&&value2!=null) {
										  file = new File(value2);
										  file.createNewFile();
										  a=true;
									  }else {
										  System.err.println("The possibility of an exception is:");
		                            	   System.err.println("Null variable exception ---> "+stre);
		                            	   System.err.println("Type are not compatible ---> "+stre);
		                            	   System.err.println("Grammar mistakes ---> "+stre);
		                            	   System.err.println("Line ---> "+num);	  
									  }
									  }catch(IOException e) {
										  System.err.println("File operation exception ---> "+stre);
										  System.err.println("Line ---> "+num);
									  }
								   }
								}
								
								if(stre.substring(0,9).equals("io.seAdd(")) {
									//io.seAdd(str3$str1@str2).Str
								    if(stre.substring(stre.length()-4,stre.length()).equals(".Str")) {
								       for(racd = 0; racd<stre.length();racd++) {
								    	   if(strs[racd] == '$') {
								    		  //承接变量 
								    		  ina=racd+1; 
								    		  adi = stre.substring(9,racd);
								    	      boolp = true;
								    	      a=true;
								    	   }
								           if(strs[racd] == '@' && boolp == true) {
								        	  //变量一
								        	   adi2 = stre.substring(ina,racd); 
								              //变量二
								        	   adi3 = stre.substring(racd+1,stre.length()-5);
								           	   //System.out.println(adi+" "+adi2+" "+adi3);
				                               if(map.get(adi) != null && map.get(adi2) != null && map.get(adi).equals("String") && map.get(adi2).equals("String") && map.get(adi3).equals("String")) {
				                            	  map2.put(adi,map2.get(adi2)+map2.get(adi3)); 
				                            	  a=true;
				                               }else {
				                            	   System.err.println("The possibility of an exception is:");
				                            	   System.err.println("Null variable exception ---> "+stre);
				                            	   System.err.println("Type are not compatible ---> "+stre);
				                            	   System.err.println("Grammar mistakes ---> "+stre);
				                            	   System.err.println("Line ---> "+num);   
				                               }
								           
								           }
								       }
								    }
								    
								}
								
								
								/*
								import CMF.Abtus main{
									String str = "HELLO WORLD!"
									FILE file = leb(syts) FILE("G:\cpvs.helo")
									InFile in = leb(orins) InFile()
									OutFile out = leb(orins) OutFile()
									let mus >! #[file,in]
									let mus >! #[file,out]
									OutLinef?::from(out).wrt().Str
									}
								
								*/
								
								if(stre.substring(0,7).equals("InFile ") && stre.substring(stre.length()-22,stre.length()).equals(" = leb(orins) InFile()")) {
								   //System.out.println("zsfghj");
								   iut = stre.substring(7,stre.length()-22);
								   //System.out.println(iut);
								   map.put(iut,"InFile");
								   a=true;
								   }
								   
								   //System.out.println(map.get(inp5));
								if(stre.substring(0,8).equals("OutFile ") && stre.substring(stre.length()-23,stre.length()).equals(" = leb(orins) OutFile()")) {
								   //System.out.println("qwnes");
								   iut2 = stre.substring(8,stre.length()-23);
								   map.put(iut2,"OutFile");
								   a=true;
								   //System.out.println(iut2);
								}
								if(stre.length() >= 13) {
                                if(stre.substring(0,13).equals("let mus >! #[")) {
                                   for(int ra = 0;ra<stre.length();ra++) {
                                	   if(strs[ra] == ',') {
                                          adi = stre.substring(13,ra);
                                          adi2 = stre.substring(ra+1,stre.length()-1);
                                          //System.out.println(adi+"--"+adi2);
                                          //System.out.println(map.get(adi2));
                                          if(map.get(adi) != null && map.get(adi2) != null) {
                                          if(map.get(adi).equals("FILE") && (map.get(adi2).equals("InFile") || map.get(adi2).equals("OutFile")) && map3.get(adi2) == null) {
                                        	 map2.put(adi2,map2.get(adi));
                                        	 map3.put(adi2,"LOCK");
                                        	 a=true;
                                          }
                                	   }else {
                                           System.err.println("The variable "+"("+adi+")"+" with "+"("+adi2+")"+"does not match"+"exception ---> "+stre);
                                       	   System.err.println("Line ---> "+num);
                                	   }
                                   }
                                   }
                                }
                                   //System.out.println(map3.get(adi2));
                                }
								if(stre.length() >= 15) {
                                if(stre.substring(0,15).equals("let unces >! #[")) {
                                	for(int ra = 0;ra<stre.length();ra++) {
                                 	   if(strs[ra] == ',') {
                                           adi = stre.substring(15,ra);
                                           adi2 = stre.substring(ra+1,stre.length()-1);
                                           //System.out.println(adi+"--"+adi2+",qwertyuiop");
                                           if(map.get(adi) != null && map.get(adi2) != null) {
                                           if(map.get(adi).equals("FILE") && (map.get(adi2).equals("InFile") || map.get(adi2).equals("OutFile")) && map3.get(adi2).equals("LOCK")) {
                                           map2.put(adi2,null);
                                           map3.put(adi2,null);
                                           a=true;
                                 	   }
                                 	   }else {
                                 		  System.err.println("The variable "+"("+adi+")"+" with "+"("+adi2+")"+"does not match"+"exception ---> "+stre);
                                      	  System.err.println("Line ---> "+num);  
                                 	   }
                                 	   }
                                    }
                                }
                                }
								
								if(stre.length() >= 12) {
								if(stre.substring(0,12).equals("ReadLinef?::")) {
								   if(stre.substring(12,17).equals("from(")) {
									   //System.out.println("ok");
									  for(int ra = 0;ra<stre.length();ra++) {
										  if(strs[ra] == ')' && strs[ra-1] == '?') {
											 in = stre.substring(17,ra-1); 
											 //System.out.println(map.get(out).equals("InFile") && map2.get(out) != null);
										  }
										  try {
										  if(stre.substring(stre.length()-1).equals(")")
										  && strs[ra] == '.' && strs[ra+1] == 'r' && strs[ra+2] == 'e'
										  && strs[ra+3] == 'a' && strs[ra+4] == 'd' && strs[ra+5] == 'w'
										  && strs[ra+6] == '(' && map.get(in).equals("InFile") && map2.get(in) != null) {
										  //System.out.println("ok3");
										  inputs = stre.substring(ra+7,stre.length()-1);
										  //System.out.println(inputs+"---"+out);
										  bur = new BufferedReader(new InputStreamReader(new FileInputStream(map2.get(in)),"UTF-8"));
										  map2.put(inputs, bur.readLine());
										  a=true;
										  }
										  if(stre.substring(stre.length()-1).equals(")") && stre.substring(stre.length()-10).equals(".FOR(true)")
										  && strs[ra] == '.' && strs[ra+1] == 'r' && strs[ra+2] == 'e'
										  && strs[ra+3] == 'a' && strs[ra+4] == 'd' && strs[ra+5] == 'w'
										  && strs[ra+6] == '(' && map.get(in).equals("InFile") && map2.get(in) != null) {
											  //System.out.println("acdf");
											  bur = new BufferedReader(new InputStreamReader(new FileInputStream(map2.get(in)),"UTF-8"));	  
											  inputs = stre.substring(ra+7,stre.length()-11);
											  for(String stb = null;(stb = bur.readLine()) != null;) {
												 // System.out.println("......");
												  list.add(stb);
												  a=true;
											  }
											  map2.put(inputs,"");
											  for(String bnh : list) {
												  map2.put(inputs,map2.get(inputs)+bnh+"$");
											  }
											  //map2.put(inputs,null);
											  //System.out.println(inputs);
											  list.clear();
											  map4.put(inputs,"crfilrin()");
										  }
									  }catch(IOException | NullPointerException e) {
                                    		 System.err.println("The possibility of an exception is:");
                                      	     System.err.println("Null variable exception ---> "+stre);
                                    		 System.err.println("File(ReadLinef?::) operation exception ---> "+stre);
                                    		 System.err.println("Illegal variable exception ---> "+stre);
      									     System.err.println("Line ---> "+num);  
									  }
									  }
								   }
								}
							}
								
								
								if(stre.length() >= 9) {
								if(stre.substring(0,9).equals("getchstr(")) {
								   //System.out.println("ok");
								   for(int ra =0;ra<stre.length();ra++) {
									   try {
									   if(strs[ra] == '?' && strs[ra+1] == ')' && strs[ra+2] == '.'
									   && strs[ra+3] == 'l' && strs[ra+4] == 'e' && strs[ra+5] == 'n' && strs[ra+6] == '('
									   && strs[stre.length()-1] == ')') {
									   iut3 = stre.substring(9,ra);
									   zapol = ra;
									   //System.out.println("ok");
									   //System.out.println("vbhnj");
									   }	   
									   if(strs[ra] == '$' && strs[ra+1] == ')' && strs[ra+2] == '.' 
									   && strs[ra+3] == 'o' && strs[ra+4] == 'f' && strs[ra+5] == 's' 
									   && strs[ra+6] == 't' && strs[ra+7] == 'r' && strs[ra+8] == '(') {
									   for(int cc = 0;cc<stre.length();cc++) {
									    if(strs[cc] == ',') {
									    iut6 = stre.substring(zapol+7,cc);
									    a=true;
									    }
									   }
									   //System.out.println("dcfgyuhcfd");
									   iut4 = stre.substring(zapol+8+iut6.length(),ra);	
									   iut5 = stre.substring(ra+9,stre.length()-1);
									   Integer incp = Integer.valueOf(iut4);
									   Integer incp2 = Integer.valueOf(iut6);
									   if(map.get(iut5).equals("String") && map4.get(iut3) == null) {
										  //System.out.println(map4.get(iut5));
										   map2.put(iut5,map2.get(iut3).substring(incp2-1,incp)); 
										   a=true;
									   }
									   if(map4.get(iut3) != null && incp2 == 3) {
									   if(map4.get(iut3).equals("crfilrin()") && map.get(iut5).equals("String")) {
										  map2.put(iut5,list.get(incp-1)); 
										  a=true;
									   }
									   }
									}
									   }catch(NullPointerException | NumberFormatException e) {
                                    		 System.err.println("The possibility of an exception is:");
                                    		 System.err.println("The parameter content is null exception ---> "+stre);  
                                    		 System.err.println("Illegal variable exception ---> "+stre);
      									     System.err.println("Line ---> "+num);  
									   } 
									   }
								}
								}
								
								if(stre.length() >= 11) {
                                if(stre.substring(0,11).equals("OutLinef?::")) {
                                   //System.out.println("zsxdfgthu");
                                   //System.out.println(stre.substring(11,16));
                                	if(stre.substring(11,16).equals("from(")) {
                                	  //System.out.println("1234");
                                		for(int ra =0;ra<stre.length();ra++) {
                                		  if(strs[ra] == ')' && strs[ra-1] == '?') {
                                			  out = stre.substring(16,ra-1); 
                                			 //System.out.println(scf);
                                		  }
                                		  //
                                		  try {
                                		  if(stre.substring(stre.length()-5).equals(").Str")
                                		  && strs[ra] == '.' && strs[ra+1] == 'w' && strs[ra+2] == 'r'
                                		  && strs[ra+3] == 't' && strs[ra+4] == '(' && strs[ra+5] == '"'
                                		  && strs[stre.length()-6] == '"' && map.get(out).equals("OutFile") && map2.get(out) != null) {
                                		  inputs = stre.substring(ra+6,stre.length()-6);
                                		  //System.out.println(inputs+"--"+map2.get(out));
                                		  buw = new BufferedWriter(new FileWriter(map2.get(out),true));
                                		  buw.write(inputs+'\n');
                                		  buw.flush();
                                		  buw.close();
                                		  a=true;
                                		  }
                                		  //
                                		  if(stre.substring(stre.length()-5).equals(").Var")
                                   		  && strs[ra] == '.' && strs[ra+1] == 'w' && strs[ra+2] == 'r'
                                   		  && strs[ra+3] == 't' && strs[ra+4] == '(' && map.get(out).equals("OutFile") && map2.get(out) != null) {
                                   		  inputs = stre.substring(ra+5,stre.length()-5);
                                   		  //System.out.println(inputs+"--"+map2.get(out));
                                   		  buw = new BufferedWriter(new FileWriter(map2.get(out),true));
                                   		  buw.write(map2.get(inputs)+'\n');
                                          buw.flush();
                                          buw.close();
                                          a=true;
                                		  }
                                		  if(stre.substring(stre.length()-5).equals(").flh") && strs[ra] == '.' && strs[ra+1] == 'w' && strs[ra+2] == 'r'
                                          && strs[ra+3] == 't' && strs[ra+4] == '(' && map.get(out).equals("OutFile") && map2.get(out) != null) {
                                	      inputs = stre.substring(ra+5,stre.length()-5);
                                	      buw = new BufferedWriter(new FileWriter(map2.get(out)));	
                                	      buw.write(map2.get(inputs)+'\n');
                                	      buw.flush();
                                	      buw.close();
                                	      a=true;
                                	      //System.out.println(strs[stre.length()-6]);
                                	      if(strs[ra+5] == '"' && strs[stre.length()-6] == '"') {
                                	      buw = new BufferedWriter(new FileWriter(map2.get(out)));
                                	      //System.out.println(stre.substring(ra+6,stre.length()-6));
                                	      buw.write(stre.substring(ra+6,stre.length()-6));
                                	      buw.flush();
                                	      buw.close();
                                	      a=true;
                                	      }
                                		  }
                                	  }catch(IOException | NullPointerException e) {
                                		 System.err.println("The possibility of an exception is:");
                                  	     System.err.println("Null variable exception ---> "+stre);
                                		 System.err.println("File(OutLinef?::) operation exception ---> "+stre);
                                		 System.err.println("Illegal variable exception ---> "+stre);
  									     System.err.println("Line ---> "+num);
                                	  }
                                		}
                                	}
                                   }
                                }
								/*
								import CMF.Abtus main{
									String str = "HELLO WORLD!"
									FILE file = leb(syts) FILE("G:\cpvs.helo")
									InFile in = leb(orins) InFile()
									OutFile out = leb(orins) OutFile()
									let mus >! #[file,in]
									let mus >! #[file,out]
									OutLinef?::from(out?).wrt("ABDS").Str
									}
								
								*/
                                //
								
								/*solmiary sol = 5
      							String str = leb(some) String()
								io.put('hello',for(sol))
								col Stack leb(some)::[String]-->(sck)
								$sck-->inpush("ABC")
								$sck-->inpush("DEF")
								$sck-->pop()::of(str)			
								*/
								
								if(stre.length()>= 4 && stre.substring(0,4).equals("col ")) {
								   if(stre.length()>= 22&&stre.substring(4,22).equals("Stack leb(some)::[")) {
									  for(int ra = 0;ra<stre.length();ra++) {
										  if(strs[ra] == ']' && strs[ra+1] == '-' && strs[ra+2] == '-' && strs[ra+3] == '>'
										  && strs[ra+4] == '(' && strs[stre.length()-1] == ')') {
										  String stp = stre.substring(22,ra);
										  String stp2 = stre.substring(ra+5,stre.length()-1);
										  if(stp.equals("String") || stp.equals("solmiary")) {
											if(stp.equals("String")){
											   //Stack<String> stck = new Stack<String>();
											   map.put(stp2,"StackString");
											}else if(stp.equals("solmiary")) {
											   //Stack<Integer> stck2 = new Stack<Integer>();
											   map.put(stp2,"StackInteger");
											}
										  }else{
										   System.err.println("Exception ---> "+stre);	  
										   System.err.println("Data type error ---> "+stp);
										   System.err.println("Line ---> "+num);
										  }
										  //System.out.println(stp2);
										  a=true;
										  }
									  }
								   }
								}
								//$sck-->inpush("ABC")
								if(stre.substring(0,1).equals("$")) {
									if(stre.substring(stre.length()-5,stre.length()).equals(" -Var")){
										for(int ra=0;ra<stre.length();ra++) {
											if(strs[ra] == '=' && strs[ra-1] == ' ' && strs[ra+1] == ' ') {
											   String strp = stre.substring(1,ra-1);
											   String strp2 = stre.substring(ra+3,stre.length()-6);
											   System.out.println(strp2);
											   a=true;
											}
										}
									}
									for(int ew =0;ew<stre.length();ew++) {
										
									}
								   for(int ra =0;ra<stre.length();ra++) {
									   if(strs[ra] == '-' && strs[ra+1] =='-' 
									   && strs[ra+2] == '>' && strs[ra+3] == 'i' && strs[ra+4] == 'n' && strs[ra+5] == 'p'
									   && strs[ra+6] == 'u' && strs[ra+7] == 's' && strs[ra+8] == 'h' && strs[ra+9] == '(' 
									   && strs[stre.length()-1] == ')') {
									   String sce = stre.substring(1,ra);
									   String sce2 = stre.substring(ra+11,stre.length()-2);
									   if(map.get(sce).equals("StackString") && strs[ra+10] == '"' && strs[stre.length()-2] == '"') {
										   if(map2.get(sce) == null) {
										   map2.put(sce,"$");
										   }
										  map2.put(sce,map2.get(sce)+sce2+"$");  
										   a=true;
									   }else if(map.get(sce).equals("StackInteger") && strs[ra+10] != '"' && strs[stre.length()-2] != '"') {
										   if(map2.get(sce) == null) {
										   map2.put(sce,"$");
										   }
										   map2.put(sce,map2.get(sce)+sce2+"$");
										   a=true;
									   }
									   //System.out.println(sce2);
									   //$sck-->pop()::of(str)
									   } 
									   if(strs[ra] == '-' && strs[ra+1] =='-' && strs[ra+2] == '>' && strs[ra+3] == 'p'
											   && strs[ra+4] == 'o' && strs[ra+5] == 'p' && strs[ra+6] == '(' && strs[ra+7] == ')'
											   && strs[ra+8] == ':' && strs[ra+9] == ':' && strs[ra+10] == 'o' && strs[ra+11] == 'f'
											   && strs[ra+12] == '(' && strs[stre.length()-1] == ')'){
										      String scep = stre.substring(1,ra);
										      String sce2p = stre.substring(ra+13,stre.length()-1);
										      //System.out.println(scep+"---"+sce2p);
										      //System.out.println(map2.get(scep));
										      if(map.get(scep).equals("StackString") && map.get(sce2p).equals("String")) {
											      String acs = map2.get(scep).substring(0,map2.get(scep).toCharArray().length-1);
										    	 fc1:
											      for(int ca = acs.toCharArray().length-1;ca>=0;ca--) {
												      //System.out.println(map2.get(scep).toCharArray().length);
												      //System.out.println(map2.get(scep));
										    		 if(acs.toCharArray()[ca] == '$') {
										    			 //System.out.println("okm");
										    			 //System.out.println(map2.get(scep));
										    			map2.put(sce2p,map2.get(scep).substring(ca+1,map2.get(scep).toCharArray().length-1));
										    			//System.out.println(map2.get(sce2p));
										    			map2.put(scep,map2.get(scep).substring(0,ca+1));
										    			//System.out.println(map2.get(sce2p));
													      a=true;
													      break fc1;
										    		 }
										    	 }
										      }
									   }
								   }
								}
								
								if(stre.length() >= 12) {
								if(stre.substring(0,12).equals("stack.outin(") &&
								   stre.substring(strs.length-5,strs.length).equals(").CMF")) {
                                   smstack = stre.substring(12,strs.length-5);
                                   if(map2.get(smstack) !=null) {
                                   String value3 = map2.get(smstack);
                                   valuep = value3.toCharArray();
                                   String mao = map4.get(smstack);
                                   if(value3!=null && mao==null) {	   
                                   map4.put(smstack,null);	   
                                   System.out.println(value3); 
                                   a=true;
								}else
                                   if(mao!=null && value3!=null) {
                                   if(mao.equals("crfilrin()")) {
                                	   //System.out.println(value3+"----");
                                	   //System.out.println("ojinm");
                                	   for(int ra=0;ra<valuep.length;ra++) {
                                		   if(valuep[ra] == '$') {
                                	   System.out.println(value3.replace("$","\r\n"));	 
                                	   break;
                                		   }
                                	   }
                                   a=true;
                                   }
                                   }else {
                                	   System.err.println("Null variable exception ---> "+stre);
                                	   System.err.println("Line ---> "+num);
                                	   //System.exit(0);
                                   }
								}else {
									System.err.println("NULL Exception!!");
								}
								}
							}
								
								if(stre.substring(0,8).equals("io.put('") &&
						    	   !stre.substring(strs.length-2,strs.length).equals("')")
								   && bool==true && bool2 == true) {
								   //inp1 = stre.substring(8,strs.length-2);
								for(int r = 0;r<strs.length;r++) {
									try {
									if(strs[r] ==','&&strs[r+1] == 'f'&&strs[r+2] == 'o'
									   &&strs[r+3] == 'r'&&strs[r+4] == '(') {
									   inp2 = stre.substring((r+5), strs.length-2);
									   inp3 = stre.substring(8,r-1);
									   if(inp2.equals("FALSE")) {
										  System.out.println(inp3); 
										  a=true;
									   }else if(inp2.equals("TRUE")) {
										  while(true){
										   System.out.println(inp3);
										   a=true;
										  }
									   }else {
										   if(!map.get(inp2).equals("int")) {
									   Integer ibp = Integer.valueOf(inp2);
									   number = ibp;
						               for(int rfc = 0;rfc<number;rfc++) {
						            	   System.out.println(inp3);
						            	   a=true;
						               }
										   }else {
											   Integer ibp = Integer.valueOf(map2.get(inp2));
											   number = ibp;
								               for(int rfc = 0;rfc<number;rfc++) {
								            	   System.out.println(inp3);
								            	   a=true;
								               }   
										   }
									   }
									}
								}catch(NumberFormatException e) {
									   System.err.println("Illegal parameter "+">>"+"("+inp2+")"+" ---> "+stre);
                                 	   System.err.println("Line ---> "+num);
								}
								}
						
								}
							}
							//G:\CMF实验文件夹\inm.CMF
							if(a != true && bool == true && bool2 == true) {
								   System.err.println("Function is incomplete ---> "+stre);
								   System.err.println("Line ---> "+num);
								   System.exit(0);
								}
								}
	        			
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        	}else {
	        	System.err.println("Function is incomplete ---> main");	
	        	}
	        }
		}
	}
	}
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		     CasMoideFCompiler CMF = new CasMoideFCompiler();
		     CMF.CasMoideFCompiler$();
			}
	
}