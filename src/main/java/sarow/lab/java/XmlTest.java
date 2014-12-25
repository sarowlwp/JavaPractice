/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java;

import com.sun.org.apache.xerces.internal.impl.Constants;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Dom4j Jaxen 解析xml示例
 * @author wenpingliu
 * @version v 0.1 12/2/14 08:15 wenpingliu Exp $$
 */
public class XmlTest {

    static String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<!DOCTYPE hibernate-configuration PUBLIC \"-//Hibernate/Hibernate Configuration DTD 3.0//EN\" \"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd\">\n"
                        + " \n"
                        + "<hero xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">"
                        + "<a:skills xmlns:a=\"http://www.sitemaps.org/schemas/sitemap/0.1\">\n"
                        + "  <!--第一个技能-->\n"
                        + "  <a:skill name=\"独孤九剑\">\n"
                        + "    <a:info>为独孤求败所创，变化万千，凌厉无比。其传人主要有风清扬、令狐冲。</a:info>\n"
                        + "  </a:skill>\n"
                        + "  <a:skill name=\"葵花宝典\">\n"
                        + "    <a:info>宦官所创，博大精深，而且凶险至极。练宝典功夫时，首先要自宫净身。</a:info>\n"
                        + "  </a:skill>\n"
                        + "  <a:skill name=\"北冥神功\">\n"
                        + "    <a:info>逍遥派的顶级内功之一，能吸人内力转化为自己所有，威力无穷。</a:info>\n"
                        + "  </a:skill>\n"
                        + "</a:skills>"
                        + "</hero>";

    static String testXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n"
                            + "<OAI-PMH xmlns=\"http://www.openarchives.org/OAI/2.0/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd\">\n"
                            + "  <responseDate>2011-09-29T00:38:59+00:00</responseDate>\n"
                            + "  <request resumptionToken=\"10.1.1.15.0-10000000-500-oai_dc\" verb=\"ListRecords\">http://citeseerx.ist.psu.edu/oai2</request>\n"
                            + "  <ListRecords>\n"
                            + "    <record>\n"
                            + "      <header>\n"
                            + "        <identifier>oai:CiteSeerXPSU:10.1.1.15.100</identifier>\n"
                            + "        <datestamp>2009-04-17</datestamp>\n"
                            + "      </header>\n"
                            + "      <metadata>\n"
                            + "        <oai_dc:dc xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:oai_dc=\"http://www.openarchives.org/OAI/2.0/oai_dc/\" xsi:schemaLocation=\"http://www.openarchives.org/OAI/2.0/oai_dc/ http://www.openarchives.org/OAI/2.0/oai_dc.xsd\">\n"
                            + "          <dc:title>A Web-Based Information System For Diagnosing, Servicing And Operating Heating Systems</dc:title>\n"
                            + "          <dc:creator>Dana Vanier</dc:creator>\n"
                            + "          <dc:creator>Jouko E. Pakanen</dc:creator>\n"
                            + "          <dc:creator>Jouko E. Pakanen Dr</dc:creator>\n"
                            + "          <dc:creator>Veli J. M脙露tt脙露nen</dc:creator>\n"
                            + "          <dc:creator>Mikko J. Hyytinen</dc:creator>\n"
                            + "          <dc:creator>Heikki A. Ruonansuu</dc:creator>\n"
                            + "          <dc:creator>Kaija K. T脙露rm脙陇kangas</dc:creator>\n"
                            + "          <dc:subject>Web engineering</dc:subject>\n"
                            + "          <dc:subject>multimedia</dc:subject>\n"
                            + "          <dc:subject>database systems</dc:subject>\n"
                            + "          <dc:subject>WAP</dc:subject>\n"
                            + "          <dc:subject>PDA</dc:subject>\n"
                            + "          <dc:subject>diagnostic methods</dc:subject>\n"
                            + "          <dc:subject>heating systems</dc:subject>\n"
                            + "          <dc:description>This paper presents a Web-based information system, called WebDia, which is designed to assist customers with such heating problems. WebDia is a prototype system, constructed for district heating substations and oil heating systems. WebDia incorporates a Web server integrated with a back-end database, accessible from a browser of a PC, a Personal Digital Assistant (PDA) or a Wireless Application Protocol (WAP) mobile phone. The general idea behind the development is that the server computer shares its resources and knowledge with the user. Besides fault diagnosis, instructions for servicing and operating the heating system are also essential topics. The information content is gathered from various publications, material provided by manufacturers and interviews with experts. A great deal of the professional information also comes from the fourteen co-operating companies assisting in the system development. WebDia is a collection of dynamic HyperText Markup Language (HTML) pages, but it also includes pictures, photographs, video and audio recordings, and animations. Most of the pages are created using server-side scripting based on Active Server Pages (ASP) technology, but Java applets are also used. Building a system like WebDia turns out to be a tedious process, which requires knowledge and expertise from several disciplines in addition to modern Web authoring and multimedia tools</dc:description>\n"
                            + "          <dc:contributor>CiteSeerX</dc:contributor>\n"
                            + "          <dc:publisher/>\n"
                            + "          <dc:date>2009-04-17</dc:date>\n"
                            + "          <dc:date>2007-11-21</dc:date>\n"
                            + "          <dc:date>2001</dc:date>\n"
                            + "          <dc:format>application/pdf</dc:format>\n"
                            + "          <dc:type>text</dc:type>\n"
                            + "          <dc:identifier>http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.15.100</dc:identifier>\n"
                            + "          <dc:source>http://www.itcon.org/2001/4/paper.pdf</dc:source>\n"
                            + "          <dc:language>en</dc:language>\n"
                            + "          <dc:relation>10.1.1.120.5511</dc:relation>\n"
                            + "          <dc:rights>Metadata may be used without restrictions as long as the oai identifier remains attached to it.</dc:rights>\n"
                            + "        </oai_dc:dc>\n"
                            + "      </metadata>\n"
                            + "    </record>\n"
                            + "    <resumptionToken>10.1.1.150.7459-10000000-15000-oai_dc</resumptionToken>\n"
                            + "  </ListRecords>\n"
                            + "</OAI-PMH>"
    + "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n"
      + "<OAI-PMH xmlns=\"http://www.openarchives.org/OAI/2.0/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd\">\n"
      + "  <responseDate>2011-09-29T00:38:59+00:00</responseDate>\n"
      + "  <request resumptionToken=\"10.1.1.15.0-10000000-500-oai_dc\" verb=\"ListRecords\">http://citeseerx.ist.psu.edu/oai2</request>\n"
      + "  <ListRecords>\n"
      + "    <record>\n"
      + "      <header>\n"
      + "        <identifier>oai:CiteSeerXPSU:10.1.1.15.100</identifier>\n"
      + "        <datestamp>2009-04-17</datestamp>\n"
      + "      </header>\n"
      + "      <metadata>\n"
      + "        <oai_dc:dc xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:oai_dc=\"http://www.openarchives.org/OAI/2.0/oai_dc/\" xsi:schemaLocation=\"http://www.openarchives.org/OAI/2.0/oai_dc/ http://www.openarchives.org/OAI/2.0/oai_dc.xsd\">\n"
      + "          <dc:title>A Web-Based Information System For Diagnosing, Servicing And Operating Heating Systems</dc:title>\n"
      + "          <dc:creator>Dana Vanier</dc:creator>\n"
      + "          <dc:creator>Jouko E. Pakanen</dc:creator>\n"
      + "          <dc:creator>Jouko E. Pakanen Dr</dc:creator>\n"
      + "          <dc:creator>Veli J. M脙露tt脙露nen</dc:creator>\n"
      + "          <dc:creator>Mikko J. Hyytinen</dc:creator>\n"
      + "          <dc:creator>Heikki A. Ruonansuu</dc:creator>\n"
      + "          <dc:creator>Kaija K. T脙露rm脙陇kangas</dc:creator>\n"
      + "          <dc:subject>Web engineering</dc:subject>\n"
      + "          <dc:subject>multimedia</dc:subject>\n"
      + "          <dc:subject>database systems</dc:subject>\n"
      + "          <dc:subject>WAP</dc:subject>\n"
      + "          <dc:subject>PDA</dc:subject>\n"
      + "          <dc:subject>diagnostic methods</dc:subject>\n"
      + "          <dc:subject>heating systems</dc:subject>\n"
      + "          <dc:description>This paper presents a Web-based information system, called WebDia, which is designed to assist customers with such heating problems. WebDia is a prototype system, constructed for district heating substations and oil heating systems. WebDia incorporates a Web server integrated with a back-end database, accessible from a browser of a PC, a Personal Digital Assistant (PDA) or a Wireless Application Protocol (WAP) mobile phone. The general idea behind the development is that the server computer shares its resources and knowledge with the user. Besides fault diagnosis, instructions for servicing and operating the heating system are also essential topics. The information content is gathered from various publications, material provided by manufacturers and interviews with experts. A great deal of the professional information also comes from the fourteen co-operating companies assisting in the system development. WebDia is a collection of dynamic HyperText Markup Language (HTML) pages, but it also includes pictures, photographs, video and audio recordings, and animations. Most of the pages are created using server-side scripting based on Active Server Pages (ASP) technology, but Java applets are also used. Building a system like WebDia turns out to be a tedious process, which requires knowledge and expertise from several disciplines in addition to modern Web authoring and multimedia tools</dc:description>\n"
      + "          <dc:contributor>CiteSeerX</dc:contributor>\n"
      + "          <dc:publisher/>\n"
      + "          <dc:date>2009-04-17</dc:date>\n"
      + "          <dc:date>2007-11-21</dc:date>\n"
      + "          <dc:date>2001</dc:date>\n"
      + "          <dc:format>application/pdf</dc:format>\n"
      + "          <dc:type>text</dc:type>\n"
      + "          <dc:identifier>http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.15.100</dc:identifier>\n"
      + "          <dc:source>http://www.itcon.org/2001/4/paper.pdf</dc:source>\n"
      + "          <dc:language>en</dc:language>\n"
      + "          <dc:relation>10.1.1.120.5511</dc:relation>\n"
      + "          <dc:rights>Metadata may be used without restrictions as long as the oai identifier remains attached to it.</dc:rights>\n"
      + "        </oai_dc:dc>\n"
      + "      </metadata>\n"
      + "    </record>\n"
      + "    <resumptionToken>10.1.1.150.7459-10000000-15000-oai_dc</resumptionToken>\n"
      + "  </ListRecords>\n"
      + "</OAI-PMH>";

    public static void main(String[] args) throws Exception {
        //testDom4j();
        testDom4j2();
        String  hello;
    }

    public static void testDom4j1() throws Exception {
        SAXReader reader = new SAXReader();
        //设置reader 放弃读取外部dtd
        reader.setFeature(
          Constants.XERCES_FEATURE_PREFIX + Constants.LOAD_EXTERNAL_DTD_FEATURE, false);
        //自定义xmlns
        Map<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put("t1", "http://www.sitemaps.org/schemas/sitemap/0.9");
        namespaceMap.put("a","http://www.sitemaps.org/schemas/sitemap/0.1");
        reader.getDocumentFactory().setXPathNamespaceURIs(namespaceMap);
        Document doc = reader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));

        //方法一

        List<Element> list=doc.selectNodes("t1:hero/a:skills/a:skill/a:info");
        for(Element ele:list){
            System.out.println(ele.getTextTrim());
        }

        //方法二

        list=doc.selectNodes("t1:hero/a:skills/a:skill");
        for(Element ele:list){
            System.out.println(ele.attribute("name").getText());
            //获取info子节点
            System.out.println(ele.element("info").getText());
        }
    }


    private static void testDom4j2() throws Exception {
        SAXReader reader = new SAXReader();
        //设置reader 放弃读取外部dtd
        Map<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put("OAI", "http://www.openarchives.org/OAI/2.0/");
        namespaceMap.put("dc","http://purl.org/dc/elements/1.1/");
        namespaceMap.put("oai_dc","http://www.openarchives.org/OAI/2.0/oai_dc/");
        reader.getDocumentFactory().setXPathNamespaceURIs(namespaceMap);
        for(String xml : testXml.split("")){
            System.out.println(testXml);
            System.out.println("-----1-----");
            Document doc = reader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
            //方法一
            List<Element> list=doc.selectNodes("OAI:OAI-PMH/OAI:ListRecords/OAI:record/OAI:metadata/oai_dc:dc");
            for(Element ele:list){
                System.out.println(ele.getName() + "|" + ele.getTextTrim());
                System.out.println(ele.element("title").getText());
                List<Element> elements = ele.elements("creator");
                for(Element e : elements){
                    System.out.println(e.getName() + "|" + e.getText());
                }
            }
        }

    }
}
