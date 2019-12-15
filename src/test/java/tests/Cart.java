package tests;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;
import java.util.Optional;

public class Cart {

    @Test
    public void test() throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
        final String xmlStr = "<ProcessSalesOrder releaseID=\"1.0\" languageCode=\"en\" xmlns=\"http://www.kingfisher.com/oagis/9\" xmlns:ns=\"http://www.openapplications.org/oagis/9\">\n" +
                "  <ns:ApplicationArea>\n" +
                "    <ns:Sender>\n" +
                "      <ns:LogicalID>ATG</ns:LogicalID>\n" +
                "      <ns:ComponentID>127.0.0.1</ns:ComponentID>\n" +
                "    </ns:Sender>\n" +
                "    <ns:CreationDateTime>2019-11-28T15:31:45.649+00:00</ns:CreationDateTime>\n" +
                "    <ns:BODID>85812795105649</ns:BODID>\n" +
                "  </ns:ApplicationArea>\n" +
                "  <DataArea>\n" +
                "    <ns:Process>\n" +
                "      <ns:ActionCriteria>\n" +
                "        <ns:ActionExpression expressionLanguage=\"xpath\" actionCode=\"Add\">/ProcessSalesOrder/DataArea/SalesOrder</ns:ActionExpression>\n" +
                "      </ns:ActionCriteria>\n" +
                "    </ns:Process>\n" +
                "    <SalesOrder>\n" +
                "      <SalesOrderHeader>\n" +
                "        <ns:DocumentID>\n" +
                "          <ns:ID schemeName=\"EXTERNAL\">1010001816</ns:ID>\n" +
                "        </ns:DocumentID>\n" +
                "        <ns:AlternateDocumentID>\n" +
                "          <ns:ID schemeName=\"ATG\">o73940850</ns:ID>\n" +
                "        </ns:AlternateDocumentID>\n" +
                "        <ns:DocumentDateTime>2019-11-28T15:31:43.976Z</ns:DocumentDateTime>\n" +
                "        <ns:Type>Standard</ns:Type>\n" +
                "        <ns:SourceID>1162</ns:SourceID>\n" +
                "        <CustomerParty>\n" +
                "          <ns:ID schemeID=\"1\" schemeName=\"ATG\">145393701</ns:ID>\n" +
                "          <ns:ID schemeID=\"2\" schemeName=\"SAP\">0060018901</ns:ID>\n" +
                "          <Login>350764675@abc.com</Login>\n" +
                "          <ns:Title>Mr</ns:Title>\n" +
                "          <ns:GivenName>Dar</ns:GivenName>\n" +
                "          <ns:FamilyName>Don</ns:FamilyName>\n" +
                "          <ns:GenderCode/>\n" +
                "          <ns:LanguageCode>en</ns:LanguageCode>\n" +
                "          <Contact>\n" +
                "            <ns:TelephoneCommunication>\n" +
                "              <ns:UseCode>DAY</ns:UseCode>\n" +
                "              <ns:FormattedNumber>76876676763</ns:FormattedNumber>\n" +
                "              <ns:Preference>\n" +
                "                <ns:Indicator>false</ns:Indicator>\n" +
                "                <ns:Description type=\"Usage\">DayToDay</ns:Description>\n" +
                "              </ns:Preference>\n" +
                "              <ns:Preference>\n" +
                "                <ns:Indicator>false</ns:Indicator>\n" +
                "                <ns:Description type=\"Usage\">OrderUpdates</ns:Description>\n" +
                "              </ns:Preference>\n" +
                "            </ns:TelephoneCommunication>\n" +
                "            <ns:MobileTelephoneCommunication>\n" +
                "              <ns:FormattedNumber>76876676763</ns:FormattedNumber>\n" +
                "              <ns:Preference>\n" +
                "                <ns:Indicator>false</ns:Indicator>\n" +
                "                <ns:Description type=\"Usage\">DayToDay</ns:Description>\n" +
                "              </ns:Preference>\n" +
                "              <ns:Preference>\n" +
                "                <ns:Indicator>false</ns:Indicator>\n" +
                "                <ns:Description type=\"Usage\">OrderUpdates</ns:Description>\n" +
                "              </ns:Preference>\n" +
                "            </ns:MobileTelephoneCommunication>\n" +
                "            <SMSTelephoneCommunication>\n" +
                "              <ns:FormattedNumber>76876676763</ns:FormattedNumber>\n" +
                "              <ns:Preference>\n" +
                "                <ns:Indicator>false</ns:Indicator>\n" +
                "                <ns:Description type=\"Usage\">DayToDay</ns:Description>\n" +
                "              </ns:Preference>\n" +
                "              <ns:Preference>\n" +
                "                <ns:Indicator>false</ns:Indicator>\n" +
                "                <ns:Description type=\"Usage\">OrderUpdates</ns:Description>\n" +
                "              </ns:Preference>\n" +
                "            </SMSTelephoneCommunication>\n" +
                "            <Location>\n" +
                "              <ns:Address>\n" +
                "                <ns:BuildingNumber/>\n" +
                "                <ns:BuildingName>bNum-id3</ns:BuildingName>\n" +
                "                <ns:StreetName>streetName-id3</ns:StreetName>\n" +
                "                <ns:CitySubDivisionName>citySubDivName-id3</ns:CitySubDivisionName>\n" +
                "                <ns:CityName>cityName-id3</ns:CityName>\n" +
                "                <ns:CountrySubDivisionCode/>\n" +
                "                <ns:CountryCode>GB</ns:CountryCode>\n" +
                "                <ns:PostalCode>M90 1NW</ns:PostalCode>\n" +
                "              </ns:Address>\n" +
                "              <ManualKeyingIndicator>false</ManualKeyingIndicator>\n" +
                "            </Location>\n" +
                "            <ns:Preference>\n" +
                "              <ns:Indicator>false</ns:Indicator>\n" +
                "              <ns:Description type=\"Kingfisher_Marketing_Consent\"/>\n" +
                "            </ns:Preference>\n" +
                "            <ns:Preference>\n" +
                "              <ns:Indicator>false</ns:Indicator>\n" +
                "              <ns:Description type=\"3rd_Party_Marketing_Consent\"/>\n" +
                "            </ns:Preference>\n" +
                "          </Contact>\n" +
                "          <Organisation>\n" +
                "            <ns:AccountID/>\n" +
                "            <ns:Name>companyName-id3</ns:Name>\n" +
                "            <OwnerIndicator>false</OwnerIndicator>\n" +
                "          </Organisation>\n" +
                "          <SalesOrganisation>\n" +
                "            <ns:ID>BQ-UK</ns:ID>\n" +
                "          </SalesOrganisation>\n" +
                "          <ns:Type name=\"Trade\">1</ns:Type>\n" +
                "          <TradeType name=\"Facilities/Maintainer\">04</TradeType>\n" +
                "          <ns:GroupType name=\"TradePoint\">1</ns:GroupType>\n" +
                "          <ns:Status>\n" +
                "            <ns:Code name=\"Uninitialized\">2</ns:Code>\n" +
                "            <ns:Type name=\"Online\">1</ns:Type>\n" +
                "          </ns:Status>\n" +
                "          <ns:Status>\n" +
                "            <ns:Code name=\"UnBlocked\">3</ns:Code>\n" +
                "            <ns:Type name=\"Order\">2</ns:Type>\n" +
                "          </ns:Status>\n" +
                "          <BrandChannel>\n" +
                "            <Brand>\n" +
                "              <ns:Code name=\"Trade Point\">TP</ns:Code>\n" +
                "            </Brand>\n" +
                "            <Channel>\n" +
                "              <ns:Code name=\"Web\">WEB</ns:Code>\n" +
                "            </Channel>\n" +
                "          </BrandChannel>\n" +
                "          <MembershipCard>\n" +
                "            <ns:ID>2900600189010001</ns:ID>\n" +
                "            <ns:Name>Dar Don</ns:Name>\n" +
                "            <ns:Type name=\"TradePointMembershipCard\">1</ns:Type>\n" +
                "            <ns:Status>\n" +
                "              <ns:Code name=\"active\">2</ns:Code>\n" +
                "            </ns:Status>\n" +
                "            <ns:CreationDateTime>2019-10-11T00:00:00.000+01:00</ns:CreationDateTime>\n" +
                "            <ExpiredDateTime>2025-12-31T00:00:00.000Z</ExpiredDateTime>\n" +
                "          </MembershipCard>\n" +
                "          <PriceSegmentGroup name=\"TradePoint\">TP</PriceSegmentGroup>\n" +
                "          <PreferredStoreID/>\n" +
                "          <OrderReferenceRequiredIndicator>false</OrderReferenceRequiredIndicator>\n" +
                "          <SensitiveIndicator>false</SensitiveIndicator>\n" +
                "          <VIPIndicator>false</VIPIndicator>\n" +
                "          <UpdateStatus>\n" +
                "            <ns:Code>CHANGED</ns:Code>\n" +
                "          </UpdateStatus>\n" +
                "          <Token>d290fd8a2d13d04773755217bc86cd4eda9545fe1832c018141ed94554948065</Token>\n" +
                "          <Transactional>true</Transactional>\n" +
                "          <CustomerRegistrationDate>2019-10-11T14:41:58.607+01:00</CustomerRegistrationDate>\n" +
                "          <CustomerLastActivityDate>2019-11-28T15:31:45.665Z</CustomerLastActivityDate>\n" +
                "        </CustomerParty>\n" +
                "        <ShipToParty>\n" +
                "          <ns:Title>Mr</ns:Title>\n" +
                "          <ns:GivenName>Dar</ns:GivenName>\n" +
                "          <ns:FamilyName>Don</ns:FamilyName>\n" +
                "          <Contact>\n" +
                "            <ns:Name>Dar Don</ns:Name>\n" +
                "            <ns:TelephoneCommunication>\n" +
                "              <ns:UseCode>PRIMARY</ns:UseCode>\n" +
                "              <ns:FormattedNumber>76876676763</ns:FormattedNumber>\n" +
                "            </ns:TelephoneCommunication>\n" +
                "            <ns:TelephoneCommunication>\n" +
                "              <ns:UseCode>PRIMARY</ns:UseCode>\n" +
                "              <ns:FormattedNumber>76876676763</ns:FormattedNumber>\n" +
                "            </ns:TelephoneCommunication>\n" +
                "            <Location>\n" +
                "              <ns:Address type=\"CUSTOMER\">\n" +
                "                <ns:BuildingName>bNum-id3</ns:BuildingName>\n" +
                "                <ns:StreetName>streetName-id3</ns:StreetName>\n" +
                "                <ns:CitySubDivisionName>citySubDivName-id3</ns:CitySubDivisionName>\n" +
                "                <ns:CityName>cityName-id3</ns:CityName>\n" +
                "                <ns:CountryCode>GB</ns:CountryCode>\n" +
                "                <ns:PostalCode>E1 7AA</ns:PostalCode>\n" +
                "              </ns:Address>\n" +
                "              <ManualKeyingIndicator>true</ManualKeyingIndicator>\n" +
                "            </Location>\n" +
                "          </Contact>\n" +
                "        </ShipToParty>\n" +
                "        <CollectionParty>\n" +
                "          <ns:Name>TradePoint Basingstoke</ns:Name>\n" +
                "          <Contact>\n" +
                "            <Location>\n" +
                "              <ns:Address>\n" +
                "                <ns:BuildingName>Lister Road</ns:BuildingName>\n" +
                "                <ns:CityName>Basingstoke</ns:CityName>\n" +
                "                <ns:CountrySubDivisionCode>HAMPSHIRE</ns:CountrySubDivisionCode>\n" +
                "                <ns:CountryCode>GB</ns:CountryCode>\n" +
                "                <ns:PostalCode>RG22 4LA</ns:PostalCode>\n" +
                "              </ns:Address>\n" +
                "            </Location>\n" +
                "          </Contact>\n" +
                "        </CollectionParty>\n" +
                "        <BillToParty>\n" +
                "          <ns:Title>Mr</ns:Title>\n" +
                "          <ns:GivenName>Dar</ns:GivenName>\n" +
                "          <ns:FamilyName>Don</ns:FamilyName>\n" +
                "          <Contact>\n" +
                "            <Location>\n" +
                "              <ns:Address>\n" +
                "                <ns:BuildingName>bNum-id3</ns:BuildingName>\n" +
                "                <ns:StreetName>streetName-id3</ns:StreetName>\n" +
                "                <ns:CitySubDivisionName>citySubDivName-id3</ns:CitySubDivisionName>\n" +
                "                <ns:CityName>cityName-id3</ns:CityName>\n" +
                "                <ns:CountryCode>GB</ns:CountryCode>\n" +
                "                <ns:PostalCode>M90 1NW</ns:PostalCode>\n" +
                "              </ns:Address>\n" +
                "            </Location>\n" +
                "          </Contact>\n" +
                "        </BillToParty>\n" +
                "        <ns:TotalAmount currencyID=\"GBP\">456.65</ns:TotalAmount>\n" +
                "        <PriceSegmentGroup>TP</PriceSegmentGroup>\n" +
                "        <InstallationManagedOrderIndicator>false</InstallationManagedOrderIndicator>\n" +
                "        <ns:Charge>\n" +
                "          <ns:Type name=\"Delivery\">DEL</ns:Type>\n" +
                "          <ns:BasisAmount currencyID=\"GBP\">0.0</ns:BasisAmount>\n" +
                "        </ns:Charge>\n" +
                "        <Payment id=\"MasterCard\">\n" +
                "          <PaymentCard>\n" +
                "            <ns:Type>MAST</ns:Type>\n" +
                "            <ns:Number>447951******0151</ns:Number>\n" +
                "            <ns:NameOnAccount>Dar Don</ns:NameOnAccount>\n" +
                "            <ns:Expiration>\n" +
                "              <ns:Month>05</ns:Month>\n" +
                "              <ns:Year>2029</ns:Year>\n" +
                "            </ns:Expiration>\n" +
                "            <PaymentAuthorization>\n" +
                "              <ns:ID schemeName=\"TERMINAL\">10.0.2.2</ns:ID>\n" +
                "              <ns:ResponseCode>0787659</ns:ResponseCode>\n" +
                "              <AuthorizationDateTime>2019-11-28T15:31:43.000Z</AuthorizationDateTime>\n" +
                "              <ns:Amount currencyID=\"GBP\">456.65</ns:Amount>\n" +
                "              <Token>438113051</Token>\n" +
                "              <CV2CheckResponseCode>2</CV2CheckResponseCode>\n" +
                "              <PCCheckResponseCode>2</PCCheckResponseCode>\n" +
                "              <ADDCheckResponseCode>2</ADDCheckResponseCode>\n" +
                "              <OverallResponseCode>REVIEW</OverallResponseCode>\n" +
                "            </PaymentAuthorization>\n" +
                "            <Referral>\n" +
                "              <ns:TransactionID>700004876777</ns:TransactionID>\n" +
                "              <ns:StatusCode>ACCEPT</ns:StatusCode>\n" +
                "              <ns:ResponseCode>0150</ns:ResponseCode>\n" +
                "            </Referral>\n" +
                "            <CleartextNumber>447951******0151</CleartextNumber>\n" +
                "          </PaymentCard>\n" +
                "          <ns:Amount currencyID=\"GBP\">456.65</ns:Amount>\n" +
                "          <TransactionType>Charge</TransactionType>\n" +
                "        </Payment>\n" +
                "        <BrandChannel>\n" +
                "          <Brand>\n" +
                "            <ns:Code>TP</ns:Code>\n" +
                "          </Brand>\n" +
                "          <Channel>\n" +
                "            <ns:Code>CCC</ns:Code>\n" +
                "          </Channel>\n" +
                "        </BrandChannel>\n" +
                "        <NearestStoreID>1017</NearestStoreID>\n" +
                "        <SettlementRequiredIndicator>false</SettlementRequiredIndicator>\n" +
                "        <ns:UserAccount>\n" +
                "          <ns:AccountID>service</ns:AccountID>\n" +
                "          <ns:AccountType>ContactCentre</ns:AccountType>\n" +
                "        </ns:UserAccount>\n" +
                "      </SalesOrderHeader>\n" +
                "      <SalesOrderLine>\n" +
                "        <ns:LineNumber schemeName=\"ATG\">1</ns:LineNumber>\n" +
                "        <ns:Status>\n" +
                "          <ns:Code>0000</ns:Code>\n" +
                "          <ns:ReasonCode>NA</ns:ReasonCode>\n" +
                "          <ns:Reason>NA</ns:Reason>\n" +
                "          <ns:Type listName=\"TECHNICAL\">SUCCESS</ns:Type>\n" +
                "        </ns:Status>\n" +
                "        <ProductItem>\n" +
                "          <ns:ItemID>\n" +
                "            <ns:ID>100373646</ns:ID>\n" +
                "          </ns:ItemID>\n" +
                "          <ns:UPCID>5013181047134</ns:UPCID>\n" +
                "          <ns:UOMCode>EA</ns:UOMCode>\n" +
                "          <ns:Dimensions>\n" +
                "            <ns:WidthMeasure unitCode=\"CMT\">0</ns:WidthMeasure>\n" +
                "            <ns:LengthMeasure unitCode=\"CMT\">0</ns:LengthMeasure>\n" +
                "            <ns:HeightMeasure unitCode=\"CMT\">0</ns:HeightMeasure>\n" +
                "            <ns:Measure type=\"WEIGHT\" unitCode=\"KGM\">0</ns:Measure>\n" +
                "          </ns:Dimensions>\n" +
                "          <ProductIndicator>\n" +
                "            <Indicator>false</Indicator>\n" +
                "            <ns:Type name=\"COSHH\">false</ns:Type>\n" +
                "          </ProductIndicator>\n" +
                "          <ShippingGroupCategoryCode>ZGSR</ShippingGroupCategoryCode>\n" +
                "          <ItemSupplier>\n" +
                "            <ns:SupplierItemID>\n" +
                "              <ns:ID>MOK100373646</ns:ID>\n" +
                "            </ns:SupplierItemID>\n" +
                "            <SupplierParty>\n" +
                "              <ns:PartyIDs>\n" +
                "                <ns:ID>3600049</ns:ID>\n" +
                "              </ns:PartyIDs>\n" +
                "            </SupplierParty>\n" +
                "          </ItemSupplier>\n" +
                "          <ns:TransportationMethodCode>ZF01</ns:TransportationMethodCode>\n" +
                "        </ProductItem>\n" +
                "        <ns:Quantity unitCode=\"EA\">1</ns:Quantity>\n" +
                "        <ns:UnitPrice>\n" +
                "          <ns:Amount currencyID=\"GBP\">10.0</ns:Amount>\n" +
                "          <ns:PerQuantity>1</ns:PerQuantity>\n" +
                "        </ns:UnitPrice>\n" +
                "        <ns:ExtendedAmount currencyID=\"GBP\">10.00</ns:ExtendedAmount>\n" +
                "        <ns:TotalAmount currencyID=\"GBP\">10.00</ns:TotalAmount>\n" +
                "        <ns:RequiredDeliveryDateTime>2019-11-29T15:31:45.685Z</ns:RequiredDeliveryDateTime>\n" +
                "        <Tax>\n" +
                "          <ns:Type>V</ns:Type>\n" +
                "          <ns:Calculation>\n" +
                "            <ns:RateNumeric>20.0</ns:RateNumeric>\n" +
                "          </ns:Calculation>\n" +
                "          <ProductTaxClassificationCode>1</ProductTaxClassificationCode>\n" +
                "        </Tax>\n" +
                "        <ns:PromisedShipDateTime>2019-11-28T16:40:00.000Z</ns:PromisedShipDateTime>\n" +
                "        <ns:PromisedDeliveryDateTime>2019-11-28T16:40:00.000Z</ns:PromisedDeliveryDateTime>\n" +
                "        <FulfilmentSiteID>1017</FulfilmentSiteID>\n" +
                "        <SalesOrderSchedule>\n" +
                "          <ns:LineNumber>1</ns:LineNumber>\n" +
                "          <DeliveryBlockIndicator>false</DeliveryBlockIndicator>\n" +
                "        </SalesOrderSchedule>\n" +
                "        <ns:CategoryCodes>\n" +
                "          <ns:Code listName=\"DEFAULT\">ZPS</ns:Code>\n" +
                "        </ns:CategoryCodes>\n" +
                "        <DeliveryGroupCode>Click1</DeliveryGroupCode>\n" +
                "        <CreateByDateTime>2019-11-28T15:31:45.688Z</CreateByDateTime>\n" +
                "        <DeliveryType>COLLECTION</DeliveryType>\n" +
                "        <DeliveryPriorityCode>NORMAL</DeliveryPriorityCode>\n" +
                "        <ns:ActionCodes>\n" +
                "          <ns:Code listName=\"Standard\">NA</ns:Code>\n" +
                "        </ns:ActionCodes>\n" +
                "        <ns:Reason>NA</ns:Reason>\n" +
                "        <FulfilmentSourceType>ClickAndCollectSameDay</FulfilmentSourceType>\n" +
                "        <ShippingMethodSource>Store</ShippingMethodSource>\n" +
                "      </SalesOrderLine>\n" +
                "      <SalesOrderLine>\n" +
                "        <ns:LineNumber schemeName=\"ATG\">2</ns:LineNumber>\n" +
                "        <ns:Status>\n" +
                "          <ns:Code>0000</ns:Code>\n" +
                "          <ns:ReasonCode>NA</ns:ReasonCode>\n" +
                "          <ns:Reason>NA</ns:Reason>\n" +
                "          <ns:Type listName=\"TECHNICAL\">SUCCESS</ns:Type>\n" +
                "        </ns:Status>\n" +
                "        <ProductItem>\n" +
                "          <ns:ItemID>\n" +
                "            <ns:ID>999100473508</ns:ID>\n" +
                "          </ns:ItemID>\n" +
                "          <ns:UPCID>9996887973942</ns:UPCID>\n" +
                "          <ns:UOMCode>EA</ns:UOMCode>\n" +
                "          <ns:Dimensions>\n" +
                "            <ns:WidthMeasure unitCode=\"CMT\">0</ns:WidthMeasure>\n" +
                "            <ns:LengthMeasure unitCode=\"CMT\">0</ns:LengthMeasure>\n" +
                "            <ns:HeightMeasure unitCode=\"CMT\">0</ns:HeightMeasure>\n" +
                "            <ns:Measure type=\"WEIGHT\" unitCode=\"KGM\">0</ns:Measure>\n" +
                "          </ns:Dimensions>\n" +
                "          <ProductIndicator>\n" +
                "            <Indicator>false</Indicator>\n" +
                "            <ns:Type name=\"COSHH\">false</ns:Type>\n" +
                "          </ProductIndicator>\n" +
                "          <ShippingGroupCategoryCode>ZPDT</ShippingGroupCategoryCode>\n" +
                "          <ItemSupplier>\n" +
                "            <ns:SupplierItemID>\n" +
                "              <ns:ID>MOK999100473508</ns:ID>\n" +
                "            </ns:SupplierItemID>\n" +
                "            <SupplierParty>\n" +
                "              <ns:PartyIDs>\n" +
                "                <ns:ID>3600049</ns:ID>\n" +
                "              </ns:PartyIDs>\n" +
                "            </SupplierParty>\n" +
                "          </ItemSupplier>\n" +
                "          <ns:TransportationMethodCode>ZF02</ns:TransportationMethodCode>\n" +
                "        </ProductItem>\n" +
                "        <ns:Quantity unitCode=\"EA\">1</ns:Quantity>\n" +
                "        <ns:UnitPrice>\n" +
                "          <ns:Amount currencyID=\"GBP\">52.65</ns:Amount>\n" +
                "          <ns:PerQuantity>1</ns:PerQuantity>\n" +
                "        </ns:UnitPrice>\n" +
                "        <ns:ExtendedAmount currencyID=\"GBP\">52.65</ns:ExtendedAmount>\n" +
                "        <ns:TotalAmount currencyID=\"GBP\">52.65</ns:TotalAmount>\n" +
                "        <ns:RequiredDeliveryDateTime>2019-11-29T15:31:45.690Z</ns:RequiredDeliveryDateTime>\n" +
                "        <Tax>\n" +
                "          <ns:Type>V</ns:Type>\n" +
                "          <ns:Calculation>\n" +
                "            <ns:RateNumeric>20.0</ns:RateNumeric>\n" +
                "          </ns:Calculation>\n" +
                "          <ProductTaxClassificationCode>1</ProductTaxClassificationCode>\n" +
                "        </Tax>\n" +
                "        <ns:PromisedShipDateTime>2019-11-27T15:31:38.319Z</ns:PromisedShipDateTime>\n" +
                "        <ns:PromisedDeliveryDateTime>2019-11-29T15:31:38.319Z</ns:PromisedDeliveryDateTime>\n" +
                "        <FulfilmentSiteID>D009</FulfilmentSiteID>\n" +
                "        <SalesOrderSchedule>\n" +
                "          <ns:LineNumber>1</ns:LineNumber>\n" +
                "          <DeliveryBlockIndicator>false</DeliveryBlockIndicator>\n" +
                "        </SalesOrderSchedule>\n" +
                "        <ns:CategoryCodes>\n" +
                "          <ns:Code listName=\"DEFAULT\">ZBFC</ns:Code>\n" +
                "        </ns:CategoryCodes>\n" +
                "        <DeliveryGroupCode>FC1</DeliveryGroupCode>\n" +
                "        <CreateByDateTime>2019-11-27T15:31:38.319Z</CreateByDateTime>\n" +
                "        <DeliveryType>DELIVERY</DeliveryType>\n" +
                "        <DeliveryPriorityCode>NEXT-DAY</DeliveryPriorityCode>\n" +
                "        <RouteType listName=\"NEXT-DAYMockRtName\">NEXT-DAYMockRtType</RouteType>\n" +
                "        <RouteStop>\n" +
                "          <ns:Type>NEXT-DAYMockRtStop</ns:Type>\n" +
                "          <StopDetail>\n" +
                "            <ns:BillOfLadingReference>\n" +
                "              <ns:Facility>\n" +
                "                <ns:IDs>\n" +
                "                  <ns:ID>NEXT-DAY123</ns:ID>\n" +
                "                </ns:IDs>\n" +
                "              </ns:Facility>\n" +
                "            </ns:BillOfLadingReference>\n" +
                "          </StopDetail>\n" +
                "        </RouteStop>\n" +
                "        <ns:ActionCodes>\n" +
                "          <ns:Code listName=\"Standard\">NA</ns:Code>\n" +
                "        </ns:ActionCodes>\n" +
                "        <ns:Reason>NA</ns:Reason>\n" +
                "        <FulfilmentSourceType>FC</FulfilmentSourceType>\n" +
                "        <CarrierParty>\n" +
                "          <ns:PartyIDs>\n" +
                "            <ns:ID>NEXT-DAYMockCarrier</ns:ID>\n" +
                "          </ns:PartyIDs>\n" +
                "          <ns:Name>NEXT-DAYMockSvcProv</ns:Name>\n" +
                "        </CarrierParty>\n" +
                "        <CarrierServiceName>NEXT-DAYMockProvName</CarrierServiceName>\n" +
                "        <ShippingMethodSource>FC</ShippingMethodSource>\n" +
                "      </SalesOrderLine>\n" +
                "      <SalesOrderLine>\n" +
                "        <ns:LineNumber schemeName=\"ATG\">3</ns:LineNumber>\n" +
                "        <ns:Status>\n" +
                "          <ns:Code>0000</ns:Code>\n" +
                "          <ns:ReasonCode>NA</ns:ReasonCode>\n" +
                "          <ns:Reason>NA</ns:Reason>\n" +
                "          <ns:Type listName=\"TECHNICAL\">SUCCESS</ns:Type>\n" +
                "        </ns:Status>\n" +
                "        <ProductItem>\n" +
                "          <ns:ItemID>\n" +
                "            <ns:ID>100416018</ns:ID>\n" +
                "          </ns:ItemID>\n" +
                "          <ns:UPCID>5016108749142</ns:UPCID>\n" +
                "          <ns:UOMCode>EA</ns:UOMCode>\n" +
                "          <ns:Dimensions>\n" +
                "            <ns:WidthMeasure unitCode=\"CMT\">0</ns:WidthMeasure>\n" +
                "            <ns:LengthMeasure unitCode=\"CMT\">0</ns:LengthMeasure>\n" +
                "            <ns:HeightMeasure unitCode=\"CMT\">0</ns:HeightMeasure>\n" +
                "            <ns:Measure type=\"WEIGHT\" unitCode=\"KGM\">0</ns:Measure>\n" +
                "          </ns:Dimensions>\n" +
                "          <ProductIndicator>\n" +
                "            <Indicator>false</Indicator>\n" +
                "            <ns:Type name=\"COSHH\">false</ns:Type>\n" +
                "          </ProductIndicator>\n" +
                "          <ShippingGroupCategoryCode>ZGRH</ShippingGroupCategoryCode>\n" +
                "          <ItemSupplier>\n" +
                "            <ns:SupplierItemID>\n" +
                "              <ns:ID>MOK100416018</ns:ID>\n" +
                "            </ns:SupplierItemID>\n" +
                "            <SupplierParty>\n" +
                "              <ns:PartyIDs>\n" +
                "                <ns:ID>3600049</ns:ID>\n" +
                "              </ns:PartyIDs>\n" +
                "            </SupplierParty>\n" +
                "          </ItemSupplier>\n" +
                "          <ns:TransportationMethodCode>ZF02</ns:TransportationMethodCode>\n" +
                "        </ProductItem>\n" +
                "        <ns:Quantity unitCode=\"EA\">1</ns:Quantity>\n" +
                "        <ns:UnitPrice>\n" +
                "          <ns:Amount currencyID=\"GBP\">387.0</ns:Amount>\n" +
                "          <ns:PerQuantity>1</ns:PerQuantity>\n" +
                "        </ns:UnitPrice>\n" +
                "        <ns:ExtendedAmount currencyID=\"GBP\">387.00</ns:ExtendedAmount>\n" +
                "        <ns:TotalAmount currencyID=\"GBP\">387.00</ns:TotalAmount>\n" +
                "        <ns:RequiredDeliveryDateTime>2019-12-05T15:31:45.693Z</ns:RequiredDeliveryDateTime>\n" +
                "        <Tax>\n" +
                "          <ns:Type>V</ns:Type>\n" +
                "          <ns:Calculation>\n" +
                "            <ns:RateNumeric>20.0</ns:RateNumeric>\n" +
                "          </ns:Calculation>\n" +
                "          <ProductTaxClassificationCode>1</ProductTaxClassificationCode>\n" +
                "        </Tax>\n" +
                "        <ns:PromisedShipDateTime>2019-11-28T15:31:45.694Z</ns:PromisedShipDateTime>\n" +
                "        <ns:PromisedDeliveryDateTime>2019-11-28T15:31:45.694Z</ns:PromisedDeliveryDateTime>\n" +
                "        <SalesOrderSchedule>\n" +
                "          <ns:LineNumber>1</ns:LineNumber>\n" +
                "          <DeliveryBlockIndicator>false</DeliveryBlockIndicator>\n" +
                "        </SalesOrderSchedule>\n" +
                "        <ns:CategoryCodes>\n" +
                "          <ns:Code listName=\"DEFAULT\">ZVH</ns:Code>\n" +
                "        </ns:CategoryCodes>\n" +
                "        <DeliveryGroupCode>DSV-1</DeliveryGroupCode>\n" +
                "        <CreateByDateTime>2019-11-28T15:31:45.694Z</CreateByDateTime>\n" +
                "        <DeliveryType>DELIVERY</DeliveryType>\n" +
                "        <DeliveryPriorityCode>NORMAL</DeliveryPriorityCode>\n" +
                "        <ns:ActionCodes>\n" +
                "          <ns:Code listName=\"Standard\">NA</ns:Code>\n" +
                "        </ns:ActionCodes>\n" +
                "        <ns:Reason>NA</ns:Reason>\n" +
                "        <FulfilmentSourceType>DSV - Delivery to Home</FulfilmentSourceType>\n" +
                "        <ShippingMethodSource>DSV</ShippingMethodSource>\n" +
                "      </SalesOrderLine>\n" +
                "      <SalesOrderLine>\n" +
                "        <ns:LineNumber schemeName=\"ATG\">4</ns:LineNumber>\n" +
                "        <ns:ShipmentReference>\n" +
                "          <ns:DocumentID>\n" +
                "            <ns:ID>NORMAL0</ns:ID>\n" +
                "          </ns:DocumentID>\n" +
                "        </ns:ShipmentReference>\n" +
                "        <ns:Status>\n" +
                "          <ns:Code>0000</ns:Code>\n" +
                "          <ns:ReasonCode>NA</ns:ReasonCode>\n" +
                "          <ns:Reason>NA</ns:Reason>\n" +
                "          <ns:Type listName=\"TECHNICAL\">SUCCESS</ns:Type>\n" +
                "        </ns:Status>\n" +
                "        <ProductItem>\n" +
                "          <ns:ItemID>\n" +
                "            <ns:ID>100610187</ns:ID>\n" +
                "          </ns:ItemID>\n" +
                "          <ns:UPCID>3663602948483</ns:UPCID>\n" +
                "          <ns:UOMCode>EA</ns:UOMCode>\n" +
                "          <ns:Dimensions>\n" +
                "            <ns:WidthMeasure unitCode=\"CMT\">0</ns:WidthMeasure>\n" +
                "            <ns:LengthMeasure unitCode=\"CMT\">0</ns:LengthMeasure>\n" +
                "            <ns:HeightMeasure unitCode=\"CMT\">0</ns:HeightMeasure>\n" +
                "            <ns:Measure type=\"WEIGHT\" unitCode=\"KGM\">0</ns:Measure>\n" +
                "          </ns:Dimensions>\n" +
                "          <ProductIndicator>\n" +
                "            <Indicator>false</Indicator>\n" +
                "            <ns:Type name=\"COSHH\">false</ns:Type>\n" +
                "          </ProductIndicator>\n" +
                "          <ShippingGroupCategoryCode>ZGSR</ShippingGroupCategoryCode>\n" +
                "          <ItemSupplier>\n" +
                "            <ns:SupplierItemID>\n" +
                "              <ns:ID>MOK100610187</ns:ID>\n" +
                "            </ns:SupplierItemID>\n" +
                "            <SupplierParty>\n" +
                "              <ns:PartyIDs>\n" +
                "                <ns:ID>3600049</ns:ID>\n" +
                "              </ns:PartyIDs>\n" +
                "            </SupplierParty>\n" +
                "          </ItemSupplier>\n" +
                "          <ns:TransportationMethodCode>ZF16</ns:TransportationMethodCode>\n" +
                "        </ProductItem>\n" +
                "        <ns:Quantity unitCode=\"EA\">1</ns:Quantity>\n" +
                "        <ns:UnitPrice>\n" +
                "          <ns:Amount currencyID=\"GBP\">7.0</ns:Amount>\n" +
                "          <ns:PerQuantity>1</ns:PerQuantity>\n" +
                "        </ns:UnitPrice>\n" +
                "        <ns:ExtendedAmount currencyID=\"GBP\">7.00</ns:ExtendedAmount>\n" +
                "        <ns:TotalAmount currencyID=\"GBP\">7.00</ns:TotalAmount>\n" +
                "        <ns:RequiredDeliveryDateTime>2019-11-29T15:31:45.696Z</ns:RequiredDeliveryDateTime>\n" +
                "        <Tax>\n" +
                "          <ns:Type>V</ns:Type>\n" +
                "          <ns:Calculation>\n" +
                "            <ns:RateNumeric>20.0</ns:RateNumeric>\n" +
                "          </ns:Calculation>\n" +
                "          <ProductTaxClassificationCode>1</ProductTaxClassificationCode>\n" +
                "        </Tax>\n" +
                "        <ns:PromisedShipDateTime>2019-11-27T15:31:38.322Z</ns:PromisedShipDateTime>\n" +
                "        <ns:PromisedDeliveryDateTime>2019-11-29T15:31:38.322Z</ns:PromisedDeliveryDateTime>\n" +
                "        <FulfilmentSiteID>1265</FulfilmentSiteID>\n" +
                "        <SalesOrderSchedule>\n" +
                "          <ns:LineNumber>1</ns:LineNumber>\n" +
                "          <DeliveryBlockIndicator>false</DeliveryBlockIndicator>\n" +
                "        </SalesOrderSchedule>\n" +
                "        <ns:CategoryCodes>\n" +
                "          <ns:Code listName=\"DEFAULT\">ZBKS</ns:Code>\n" +
                "        </ns:CategoryCodes>\n" +
                "        <DeliveryGroupCode>Hub1</DeliveryGroupCode>\n" +
                "        <CreateByDateTime>2019-11-27T15:31:38.322Z</CreateByDateTime>\n" +
                "        <DeliveryType>DELIVERY</DeliveryType>\n" +
                "        <DeliveryPriorityCode>NORMAL</DeliveryPriorityCode>\n" +
                "        <RouteType listName=\"NORMALMockRtName\">NORMALMockRtType</RouteType>\n" +
                "        <RouteStop>\n" +
                "          <ns:Type>NORMALMockRtStop</ns:Type>\n" +
                "          <StopDetail>\n" +
                "            <ns:BillOfLadingReference>\n" +
                "              <ns:Facility>\n" +
                "                <ns:IDs>\n" +
                "                  <ns:ID>NORMAL123</ns:ID>\n" +
                "                </ns:IDs>\n" +
                "              </ns:Facility>\n" +
                "            </ns:BillOfLadingReference>\n" +
                "          </StopDetail>\n" +
                "        </RouteStop>\n" +
                "        <ns:ActionCodes>\n" +
                "          <ns:Code listName=\"Standard\">NA</ns:Code>\n" +
                "        </ns:ActionCodes>\n" +
                "        <ns:Reason>NA</ns:Reason>\n" +
                "        <FulfilmentSourceType>Hub</FulfilmentSourceType>\n" +
                "        <PalletCount>1</PalletCount>\n" +
                "        <CarrierParty>\n" +
                "          <ns:PartyIDs>\n" +
                "            <ns:ID>NORMALMockCarrier</ns:ID>\n" +
                "          </ns:PartyIDs>\n" +
                "          <ns:Name>TradePoint</ns:Name>\n" +
                "        </CarrierParty>\n" +
                "        <CarrierServiceName>NORMALMockProvName</CarrierServiceName>\n" +
                "        <ShippingMethodSource>Hub</ShippingMethodSource>\n" +
                "      </SalesOrderLine>\n" +
                "      <SalesOrderLine>\n" +
                "        <ns:LineNumber schemeName=\"DELIVERY_CHARGE\">9000</ns:LineNumber>\n" +
                "        <ProductItem>\n" +
                "          <ns:ItemID>\n" +
                "            <ns:ID>100119711</ns:ID>\n" +
                "          </ns:ItemID>\n" +
                "          <ns:UPCID>0000003089224</ns:UPCID>\n" +
                "          <ns:UOMCode>EA</ns:UOMCode>\n" +
                "          <ShippingGroupCategoryCode>ZGIN</ShippingGroupCategoryCode>\n" +
                "        </ProductItem>\n" +
                "        <ns:Quantity unitCode=\"EA\">1</ns:Quantity>\n" +
                "        <ns:UnitPrice>\n" +
                "          <ns:Amount currencyID=\"GBP\">0.0</ns:Amount>\n" +
                "          <ns:PerQuantity>1</ns:PerQuantity>\n" +
                "        </ns:UnitPrice>\n" +
                "        <ns:ExtendedAmount currencyID=\"GBP\">0.0</ns:ExtendedAmount>\n" +
                "        <ns:TotalAmount currencyID=\"GBP\">0.0</ns:TotalAmount>\n" +
                "        <ns:RequiredDeliveryDateTime>2019-11-29T15:31:38.000Z</ns:RequiredDeliveryDateTime>\n" +
                "        <Tax>\n" +
                "          <ns:Type>V</ns:Type>\n" +
                "          <ns:Calculation>\n" +
                "            <ns:RateNumeric>20.0</ns:RateNumeric>\n" +
                "          </ns:Calculation>\n" +
                "          <ProductTaxClassificationCode>1</ProductTaxClassificationCode>\n" +
                "        </Tax>\n" +
                "        <SalesOrderSchedule>\n" +
                "          <ns:LineNumber>1</ns:LineNumber>\n" +
                "        </SalesOrderSchedule>\n" +
                "        <ns:CategoryCodes>\n" +
                "          <ns:Code>ZSER</ns:Code>\n" +
                "        </ns:CategoryCodes>\n" +
                "        <DeliveryGroupCode>001</DeliveryGroupCode>\n" +
                "        <ns:ActionCodes>\n" +
                "          <ns:Code listName=\"Standard\">NA</ns:Code>\n" +
                "        </ns:ActionCodes>\n" +
                "      </SalesOrderLine>\n" +
                "    </SalesOrder>\n" +
                "  </DataArea>\n" +
                "</ProcessSalesOrder>";



        NodeList ean = convertStringToXMLDocument(xmlStr, "//ProductItem//UPCID");

        System.out.println(getXmlTagContent(ean, 0));
        System.out.println(getXmlTagContent(ean,1));
        System.out.println(getXmlTagContent(ean,2));


        NodeList transportationMethodCode = convertStringToXMLDocument(xmlStr, "//ProductItem//TransportationMethodCode");

        System.out.println(getXmlTagContent(transportationMethodCode,0));
        System.out.println(getXmlTagContent(transportationMethodCode,1));
        System.out.println(getXmlTagContent(transportationMethodCode,2));

        NodeList promisedDeliveryDateTime = convertStringToXMLDocument(xmlStr, "//SesOrderLine//PromisedDeliveryDateTime");

        System.out.println(getXmlTagContent(promisedDeliveryDateTime,0));


        System.out.println();

    }

    public static String getXmlTagContent(NodeList node, int index){
        return Optional.of(node.item(index).getTextContent()).orElseThrow(() -> new IllegalArgumentException("PLEASE SPECIFY NEW XML LOCATOR"));
    }

    private static NodeList convertStringToXMLDocument(String xmlString, String xmlXpath) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlString));
            Document doc = builder.parse(is);

            XPath xPath =  XPathFactory.newInstance().newXPath();

            String expression = String.format(xmlXpath);

            NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(
                    doc, XPathConstants.NODESET);
        return nodeList;

    }

}
