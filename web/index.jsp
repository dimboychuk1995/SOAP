<%-- 
    Document   : index
    Created on : Feb 8, 2013, 8:00:16 AM
    Author     : us8610
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          

       

        <hr>
       
        <table>
            <tr>                
                <td>
                    <h3>Personal Communication List</h3>
                    <FORM ACTION="PersonSearch" METHOD="post">
                        <INPUT TYPE="hidden" value="COMMUNIC" NAME="task">
                        Person: <INPUT TYPE="text" NAME="employee_id"><br/>
                        Last name: <INPUT TYPE="text" NAME="last_name"><br/>
                        First name: <INPUT TYPE="text" NAME="first_name"><br/>
                        Org name: <INPUT TYPE="text" NAME="org_name"><br/>
                        Job name: <INPUT TYPE="text" NAME="job_name"><br/>
                        Org Id(todo): <INPUT TYPE="text" NAME="org_id"><br/>
                        Job Id(todo): <INPUT TYPE="text" NAME="job_id"><br/>
                        <INPUT TYPE="submit" VALUE="Search">
                    </FORM>
                </td>
                <td>
                    <h3>Personal Communication Full List</h3>
                    <FORM ACTION="PersonSearch" METHOD="post">
                        <INPUT TYPE="hidden" value="COMMUNIC" NAME="task">
                        Only Communic: <INPUT TYPE="text" NAME="only_communic"><br/>
                        Person: <INPUT TYPE="text" NAME="employee_id"><br/>
                        Last name: <INPUT TYPE="text" NAME="last_name"><br/>
                        First name: <INPUT TYPE="text" NAME="first_name"><br/>
                        Org name: <INPUT TYPE="text" NAME="org_name"><br/>
                        Job name: <INPUT TYPE="text" NAME="job_name"><br/>
                        Org Id(todo): <INPUT TYPE="text" NAME="org_id"><br/>
                        Job Id(todo): <INPUT TYPE="text" NAME="job_id"><br/>
                        TEL_ATS: <INPUT TYPE="text" NAME="tel_ats"><br/>
                        <INPUT TYPE="submit" VALUE="Search">
                    </FORM>
                </td>
               
                <td>
                    <h3>Job Position List</h3>
                    <FORM ACTION="PersonSearch" METHOD="post">
                        <INPUT TYPE="hidden" value="JOB_POS" NAME="task">                        
                        <INPUT TYPE="submit" VALUE="Search">
                    </FORM>
                </td>
                <td>
                    <h3>Organization Units List</h3>
                    <FORM ACTION="PersonSearch" METHOD="post">
                        <INPUT TYPE="hidden" value="ORG_UNIT_LIST" NAME="task">
                        <INPUT TYPE="submit" VALUE="Search">
                    </FORM>
                </td>                
            </tr>                        
        </table>
    </body>
</html>
