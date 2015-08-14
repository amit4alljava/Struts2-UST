<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sj:head jqueryui="true" jquerytheme="redmond"/>
</head>
<body>
<sj:datepicker id="dob" label="DOB" displayFormat="mm/dd/yy" numberOfMonths="3"
changeYear="true" changeMonth="true"></sj:datepicker>
<sj:dialog id="d1" title="My Dialog" autoOpen="false">
This is My Dialog Box of JQuery
</sj:dialog>
<sj:a openDialog="d1" id="b1" button="true" >Click</sj:a>
<sj:tabbedpanel id="localtabs" cssClass="list">
                             <sj:tab id="tab1" target="tone"  label="Local Tab One"/>
                             <sj:tab id="tab2" target="ttwo" label="Local Tab Two"/>
                             <sj:tab id="tab3" target="tthree" label="Local Tab Three"/>
                             <sj:tab id="tab4" target="tfour" label="Local Tab Four"/>
                             <div id="tone" >Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer ut neque. Vivamus nisi
                                 metus, molestie vel, gravida in, condimentum sit amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin
                                 viverra leo ut odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.
                             </div>
                             <div id="ttwo">Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor
                                 at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam.
                                 In suscipit faucibus urna.
                             </div>
                             <div id="tthree">Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis. Phasellus pellentesque
                                 purus in massa. Aenean in pede. Phasellus ac libero ac tellus pellentesque semper. Sed ac felis. Sed commodo,
                                 magna quis lacinia ornare, quam ante aliquam nisi, eu iaculis leo purus venenatis dui.
                             </div>
                             <div id="tfour">Cras dictum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis
                                 egestas. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean lacinia
                                 mauris vel est. Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus. Class aptent taciti
                                 sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.
                             </div>
                         </sj:tabbedpanel>

</body>
</html>