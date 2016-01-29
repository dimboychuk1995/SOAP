/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import test.TableOfZpernComm;
import test.ZpernComm;
import test1.Bapiret2;
import test1.Objec;
import test1.TableOfBapiObjec;
import test2.ZorgUnitList;
import test3.Bapireturn;

/**
 *
 * @author us8610
 */
public class PersonSearch extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     response.addHeader("Access-Control-Allow-Origin", "*");
     PrintWriter out = response.getWriter();
        
     try {
     String value = new String();
     test.Service service = new test.Service();
     test.ZpersonComm port = service.getZpersonComm();
     BindingProvider prov = (BindingProvider) port;
     prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "ws_user");
     prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "qwerty");
     Holder<TableOfZpernComm> holder = new Holder<TableOfZpernComm>(new TableOfZpernComm());
     port.zPersonalCommunication("", "", "", "", name, "", "", holder);

     for (Iterator it = holder.value.getItem().iterator(); it.hasNext();) {
     ZpernComm person = (ZpernComm) it.next();

     /*  value +=  "<tr class='row'><td>"
     + "<div id='" + person.getJob() + "' style='display:none;'><div id='dlg_cont_m'>"
     + "<h3>" + person.getFamily()+ person.getName() + "</h3>"
     + "<h4>" + person.getJobtxt() + "</h4>" + "<h4>" + person.getOrgtxt() + "</h4><h4 class='a1_noed' >" + person.getEmail() + "</h4><input class='a1_ed' size='40' name='email' value='" + person.getEmail() + "' >"
     + "<a href='#' class='bada'>Повідомити про невідповідність адреси</a><br />"
     + "</div>"
     + "<div id='dlg_cont_t'>"
     + "<h3 class='a2_noed'>" + person.getTelAts() + "</h3><span class='a2_ed'>()<input size='5' name='tel_ats' value='" + person.getTelAts() + "' ></span><br  class='ed' />"
     + "<h4  class='a2_noed'>міськ. " + person.getTelAts()  + "</h4>"
     + "<span class='a2_ed'>міськ.()<input size='5' name='tel_MISTO' value='" + person.getTelAts()  + "' ></span><br  class='a2_ed' />"
     + "<span class='ed' ><button class='save' onclick='savefunck()'>Зберегти</button></span>"
     + "<a href='#' class='badt'>Повідомити про невідповідність телефону</a>"
     + "</div>"
     + "<div id='dlg_cont_f'><div style='display:none;'>" + person.getTabno() + "</div>"
     + "<img src='http://10.93.10.59/data/prvidom/foto/стек/f" + person.getTabno() + "f.jpg'>"
     + "</div></div>"
     + person.getFamily()+ person.getName() + "</td><td>" + person.getTelAts() + "</td><td>" + person.getEmail() + "</td><td>" + person.getJobtxt() + "</td></tr>";
                
     value+="<tr class='row'><td>"+
     "<div id='"+ person.getJob() +"' style='display:none;'><div id='dlg_cont_m'>"+
     "<h3>"+ person.getFamily()+ person.getName() +"</h3>"+
     "<h4>"+ person.getJobtxt() +"</h4>"+"<h4>"+ person.getOrgtxt() +"</h4><h4 class='a1_noed' >"+ person.getEmail() + "</h4><input class='a1_ed' size='40' name='email' value='"+ person.getEmail() +"' >"+
     "<a href='#' class='bada'>Повідомити про невідповідність адреси</a><br />"+    
     "</div>"+
     "<div id='dlg_cont_t'>"+
     "<h3 class='a2_noed'>"+ person.getTelAts() +"</h3><span class='a2_ed'>("+person.getKodAts()+")<input size='5' name='tel_ats' value='"+person.getTelAts()+"' ></span><br  class='ed' />"+
     ((!person.getTelMisto().equals("")) ? "<h4  class='a2_noed'>міськ. "+person.getTelMisto()+"</h4>" : "")+
     "<span class='a2_ed'>міськ.("+person.getKodMisto()+")<input size='5' name='tel_MISTO' value='"+person.getTelMisto()+"' ></span><br  class='a2_ed' />"+
     ((!person.getTelMob1().equals("")) ? "<h4  class='a2_noed'>моб. "+person.getTelMob1()+"</h4>" : "")+
     "<span class='a2_ed'>моб.<input size='10' name='mob1' value='"+person.getTelMob1()+"' ></span><br  class='a2_ed' />"+
     ((!person.getTelMob2().equals("")) ? "<h4  class='a2_noed'>моб. "+person.getTelMob2()+"</h4>" : "")+
     "<span class='a2_ed'>моб.<input size='10' name='mob2' value='"+person.getTelMob2()+"' ></span><br  class='a2_ed' />"+
     ((!person.getTelFax().equals("")) ? "<h4  class='a2_noed'>факс "+person.getTelFax()+"</h4>" : "")+
     "<span class='a2_ed'>факс<input size='10' name='fax' value='"+person.getTelFax()+"' ></span><br  class='a2_ed' />"+
     "<input type='hidden' name='tel_home' value='"+person.getTelHome()+"' >"+
     "<span class='ed' ><button class='save' onclick='savefunck()'>Зберегти</button></span>"+
                                                
     "<a href='#' class='badt'>Повідомити про невідповідність телефону</a>"+
     "</div>"+
     "<div id='dlg_cont_f'><div style='display:none;'>"+person.getTabno()+"</div>"+
     "<img src='http://10.93.10.59/data/prvidom/foto/f"+person.getTabno()+"f.jpg'>"+
     "</div></div>"+
     person.getFamily()+" "+person.getName()+" "+person.getFather()+"</td><td>"+person.getTelAts()+"</td><td>"+ person.getEmail()+"</td><td>"+person.getJobtxt()+"</td></tr>";
     }
     out.println(value);
     } finally {
     out.close();
     }
     }

     // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
     /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();
        try {
            String task = request.getParameter("task");
            // task="JOB_POS";
 
            task = (task == null ? "null" : task);
            if (task.equals("COMMUNIC")) {
                String value = new String();

                String telAts = request.getParameter("tel_ats").replaceAll("-", "");
                if (telAts.equals("**")||telAts.equals("*")) {
                    telAts = "";
                }
                String strOnlyCommunic = request.getParameter("only_communic");
                String jobId = request.getParameter("job_id");
                String employeeId = request.getParameter("employee_id");
                String name = request.getParameter("last_name");
                String posada = request.getParameter("job_name");
                if (posada.length() > 10) {
                    posada = "*" + posada.substring(0, 9) + "*";
                } else {
                    posada = "*" + posada + "*";
                }

                String orgId = request.getParameter("org_id");
                test.ZPERSON_COMMUNIC2 service = new test.ZPERSON_COMMUNIC2();
                test.ZpersonCommunic port = service.getZPERSONCOMMUNIC();
                BindingProvider prov = (BindingProvider) port;
                prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "ws_user");
                prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "Web-serv1ces");
                Holder<TableOfZpernComm> holder = new Holder<TableOfZpernComm>(new TableOfZpernComm());
                port.zPersonalSearch(strOnlyCommunic,employeeId, "", jobId, posada, name, orgId, "", holder,telAts);
                for (Iterator it = holder.value.getItem().iterator(); it.hasNext();) {
                    ZpernComm person = (ZpernComm) it.next();
                    String name1 = person.getFamily();
                    String name2 = person.getName();
                    String name3 = person.getFather();
                    String kod_ats = person.getKodAts();
                    String tel_ats = person.getTelAts();
                    if (!tel_ats.equals("")) {
                        tel_ats = new StringBuffer(tel_ats).insert(tel_ats.length() - 2, "-").toString();
                    } else {
                        tel_ats = "";
                    }
                    String full_ats;
                    if (!kod_ats.equals("")) {
                        full_ats = "(" + kod_ats + ")" + tel_ats;
                    } else {
                        full_ats = tel_ats;
                    }
                    String kod_MISTO = person.getKodMisto();
                    String tel_MISTO = person.getTelMisto();
                    String tel_home = person.getTelHome();
                    String jobtxt = person.getJobtxt();
                    Integer tnom = Integer.parseInt(person.getTabno());
                    String tn = tnom.toString();
                    String org = person.getOrgtxt();
                    String org_id = person.getOrgUnit();
                    String mob1 = person.getTelMob1();
                    String mob2 = person.getTelMob2();
                    String fax = person.getTelFax();
                    String em = person.getEmail().toLowerCase();
                    String email = "<a href='mailto:" + em + "'>" + em + "</a>";
                    value += "<tr class='row'><td>"
                            + "<div id='" + org_id + "' style='display:none;'><div id='dlg_cont_m'>"
                            + "<h3>" + name1 + " " + name2 + " " + name3 + "</h3>"
                            + "<h4>" + org + "</h4>" + "<h4>" + jobtxt + "</h4><h4 class='a1_noed' >" + email + "</h4><input class='a1_ed' size='40' name='email' value='" + em + "' >"
                            + "<a href='#' class='bada'>Повідомити про невідповідність адреси</a><br />"
                            + "</div>"
                            + "<div id='dlg_cont_t'>"
                            + "<h3 class='a2_noed'>" + full_ats + "</h3><span class='a2_ed'>(" + kod_ats + ")<input size='5' name='tel_ats' value='" + tel_ats + "' ></span><br  class='ed' />"
                            + ((!tel_MISTO.equals("")) ? "<h4  class='a2_noed'>міськ. " + tel_MISTO + "</h4>" : "")
                            + "<span class='a2_ed'>міськ.(" + kod_MISTO + ")<input size='5' name='tel_MISTO' value='" + tel_MISTO + "' ></span><br  class='a2_ed' />"
                            + ((!mob1.equals("")) ? "<h4  class='a2_noed'>моб. " + mob1 + "</h4>" : "")
                            + "<span class='a2_ed'>моб.<input size='10' name='mob1' value='" + mob1 + "' ></span><br  class='a2_ed' />"
                            + ((!mob2.equals("")) ? "<h4  class='a2_noed'>моб. " + mob2 + "</h4>" : "")
                            + "<span class='a2_ed'>моб.<input size='10' name='mob2' value='" + mob2 + "' ></span><br  class='a2_ed' />"
                            + ((!fax.equals("")) ? "<h4  class='a2_noed'>факс " + fax + "</h4>" : "")
                            + "<span class='a2_ed'>факс<input size='10' name='fax' value='" + fax + "' ></span><br  class='a2_ed' />"
                            + "<input type='hidden' name='tel_home' value='" + tel_home + "' >"
                            + "<span class='ed' ><button class='save' onclick='savefunck()'>Зберегти</button></span>"
                            + "<a href='#' class='badt'>Повідомити про невідповідність телефону</a>"
                            + "</div>"
                            + "<div id='dlg_cont_f'><div style='display:none;'>" + tn + "</div>"
                            + "<img src='http://10.93.10.59/data/prvidom/foto/f" + tn + "f.jpg'>"
                            + "</div></div>"
                            + name1 + " " + name2 + " " + name3 + "</td><td>" + tel_ats +"</td><td>" + email + "</td><td>" + jobtxt + "</td></tr>";

                    /*value += "<tr class='row'><td>"
                     + "<div id='" + person.getJob() + "' style='display:none;'><div id='dlg_cont_m'>"
                     + "<h3>" + name1 + " " + name2 + " " + name3 + "</h3>"
                     + "<h4>" + person.getJobtxt() + "</h4>" + "<h4>" + person.getOrgtxt() + "</h4><h4 class='a1_noed' >" + email + "</h4><input class='a1_ed' size='40' name='email' value='" + em + "' >"
                     + "<a href='#' class='bada'>Повідомити про невідповідність адреси</a><br />"
                     + "</div>"
                     + "<div id='dlg_cont_t'>"
                     + "<h3 class='a2_noed'>" + person.getTelAts() + "</h3><span class='a2_ed'>(" + person.getKodAts() + ")<input size='5' name='tel_ats' value='" + person.getTelAts() + "' ></span><br  class='ed' />"
                     + ((!person.getTelMisto().equals("")) ? "<h4  class='a2_noed'>міськ. " + person.getTelMisto() + "</h4>" : "")
                     + "<span class='a2_ed'>міськ.(" + person.getKodMisto() + ")<input size='5' name='tel_MISTO' value='" + person.getTelMisto() + "' ></span><br  class='a2_ed' />"
                     + ((!person.getTelMob1().equals("")) ? "<h4  class='a2_noed'>моб. " + person.getTelMob1() + "</h4>" : "")
                     + "<span class='a2_ed'>моб.<input size='10' name='mob1' value='" + person.getTelMob1() + "' ></span><br  class='a2_ed' />"
                     + ((!person.getTelMob2().equals("")) ? "<h4  class='a2_noed'>моб. " + person.getTelMob2() + "</h4>" : "")
                     + "<span class='a2_ed'>моб.<input size='10' name='mob2' value='" + person.getTelMob2() + "' ></span><br  class='a2_ed' />"
                     + ((!person.getTelFax().equals("")) ? "<h4  class='a2_noed'>факс " + person.getTelFax() + "</h4>" : "")
                     + "<span class='a2_ed'>факс<input size='10' name='fax' value='" + person.getTelFax() + "' ></span><br  class='a2_ed' />"
                     + "<input type='hidden' name='tel_home' value='" + person.getTelHome() + "' >"
                     + "<span class='ed' ><button class='save' onclick='savefunck()'>Зберегти</button></span>"
                     + "<a href='#' class='badt'>Повідомити про невідповідність телефону</a>"
                     + "</div>"
                     + "<div id='dlg_cont_f'><div style='display:none;'>" + tn + "</div>"
                     + "<img src='http://10.93.10.59/data/prvidom/foto/f" + tn + "f.jpg'>"
                     + "</div></div>"
                     + person.getFamily() + " " + person.getName() + " " + person.getFather() + "</td><td>" + person.getTelAts() + "</td><td>" + person.getEmail() + "</td><td>" + person.getJobtxt() + "</td></tr>";*/
                }
                out.println(value);
            } else if (task.equals("COMMUNIC_UPDATE")) {
                String employeeId = request.getParameter("employee_id");
                String strAts = request.getParameter("ats").replaceAll("-","");
                String strMisto = request.getParameter("misto");
                String strCell1 = request.getParameter("mob1");
                String strCell2 = request.getParameter("mob2");
                String strHome = request.getParameter("home");
                String strEmail = request.getParameter("email");
                String strFax = request.getParameter("fax");
                zPersonalUpdate(strEmail, employeeId, strAts, strFax, strHome, strMisto, strCell1, strCell2);
                
                out.println("ok");

            } else if (task.equals("JOB_POS")) {
                test1.ZPOSADY_LIST2 service1 = new test1.ZPOSADY_LIST2();
                test1.zposady_list1 port1 = service1.getZPOSADYLIST();
                BindingProvider prov1 = (BindingProvider) port1;
                prov1.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "ws_user");
                prov1.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "Web-serv1ces");
                Holder<test1.TableOfBapiObjec> posadyList = new Holder<TableOfBapiObjec>(new TableOfBapiObjec());
                port1.zPosadyList(posadyList);
                response.setContentType("text/xml;charset=UTF-8");
                String value = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><main>";
                for (Iterator it = posadyList.value.getItem().iterator(); it.hasNext();) {
                    Objec pos = (Objec) it.next();
                    value += "<LONG_TEXT>" + pos.getLongText() + "</LONG_TEXT>";
                }
                value += "</main>"; 
                out.println(value);

            } else if (task.equals("ORG_UNIT_LIST")) {
                String value = new String();
                test2.ZLIST_DEPARTMENT service2 = new test2.ZLIST_DEPARTMENT();
                test2.ZlistDepartment port2 = service2.getZLISTDEPARTMENT();
                BindingProvider prov2 = (BindingProvider) port2;
                prov2.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "ws_user");
                prov2.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "Web-serv1ces");
                Holder<test2.TableOfZorgUnitList> myorglist = new Holder<test2.TableOfZorgUnitList>(new test2.TableOfZorgUnitList());
                port2.zdepartmetsList(myorglist);
                ArrayList<Item> arr = new ArrayList<Item>();
                for (Iterator it = myorglist.value.getItem().iterator(); it.hasNext();) {
                    ZorgUnitList unitlist = (ZorgUnitList) it.next();
                    arr.add(new Item(unitlist.getObjectId(), unitlist.getLongText(), unitlist.getParentId()));
                }

                value += recurs(6, arr, "00000000");

                out.println(value);
            } else {
                out.println("Employee: uncorrect task = " + task);

            }
        } finally {
            out.close();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    private static final char[] hexChar = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    private static String unicodeEscape(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >> 7) > 0) {
                sb.append("\\u");
                sb.append(hexChar[(c >> 12) & 0xF]); // append the hex character for the left-most 4-bits
                sb.append(hexChar[(c >> 8) & 0xF]);  // hex for the second group of 4-bits from the left
                sb.append(hexChar[(c >> 4) & 0xF]);  // hex for the third group
                sb.append(hexChar[c & 0xF]);         // hex for the last group, e.g., the right most 4-bits
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private String recurs(int i, ArrayList<Item> arr, String id) {

        String value = new String();
        String rez = new String();
        if (i == 1) {
            return "";
        }

        ArrayList<Item> arrcopy = null;

        for (Item rs : arr) {
            if (rs.par_id.equals(id)) {
                value += "<li><span id='sp_" + rs.id + "'>" + rs.name
                        + //" "+rs.getString("TEL")+
                        "</span>";
                String idL1 = rs.id;
                value += recurs(i - 1, arr, idL1);
                value += "</li>";
            }
        }
        if (value.length() > 0) {
            rez = "<ul>" + value + "</ul>";
        } else {
            rez = value;
        }

        return rez;
    }
    /* private String recurs(int i, ArrayList<Item> arr ,String id){
   
     String value = new String();
     String rez = new String();
     if (i==1) return "";
       
     arr.
     if (arr.size() > 0){
     do {
     if(orgUnitTable.getString("PARENT_ID").equals(id)){
     value+= "<li><span id='sp_"+orgUnitTable.getString("OBJECT_ID")+"'>"+orgUnitTable.getString("LONG_TEXT")+" "+orgUnitTable.getString("TEL")+"</span>";
     String idL1 =orgUnitTable.getString("OBJECT_ID");
     value+=recurs(i-1,(JCO.Table)orgUnitTable.clone(),idL1);
     value+="</li>";
     }
     } while (orgUnitTable.nextRow());
     if(value.length()>0){rez="<ul>"+value+"</ul>";}else{rez=value;}
     }
     return rez;
     } */

    class Item {

        public String id;
        public String name;
        public String par_id;

        public Item(String id, String name, String par_id) {
            this.id = id;
            this.name = name;
            this.par_id = par_id;
        }
    }

    private static Bapireturn zPersonalUpdate(java.lang.String email, java.lang.String employeeId, java.lang.String telAts, java.lang.String telFax, java.lang.String telHome, java.lang.String telMisto, java.lang.String telMob1, java.lang.String telMob2) {
        test3.Serv service = new test3.Serv();
        test3.ZpersonUpdate port = service.getZPERSONUPDATE();
        BindingProvider prov = (BindingProvider) port;
                prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "ws_user");
                prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "Web-serv1ces");
        return port.zPersonalUpdate(email, employeeId, telAts, telFax, telHome, telMisto, telMob1, telMob2);
    }
}
