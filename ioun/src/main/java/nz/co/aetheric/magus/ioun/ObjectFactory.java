
package nz.co.aetheric.magus.ioun;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nz.co.aetheric.magus.ioun package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DataWithVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "DataWithVersion");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfContentDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ArrayOfContentDetails");
    private final static QName _UriContentBlob_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "UriContentBlob");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ContentNotFoundFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentManagement", "ContentNotFoundFault");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ContentDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ContentDetails");
    private final static QName _TooMuchContentFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentManagement", "TooMuchContentFault");
    private final static QName _ArrayOfContentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ArrayOfContentInfo");
    private final static QName _RawContentBlob_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "RawContentBlob");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _IdentifierWithVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "IdentifierWithVersion");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _NotifyPropertyChangedBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.XAMLUtilities", "NotifyPropertyChangedBase");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ContentIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ContentIdentifier");
    private final static QName _ContentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ContentInfo");
    private final static QName _ContentBlob_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ContentBlob");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _TooMuchScratchFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentManagement", "TooMuchScratchFault");
    private final static QName _UserContentRights_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentManagement", "UserContentRights");
    private final static QName _UndeleteContentId_QNAME = new QName("http://tempuri.org/", "id");
    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _LoginUserName_QNAME = new QName("http://tempuri.org/", "userName");
    private final static QName _ImportResponseImportResult_QNAME = new QName("http://tempuri.org/", "ImportResult");
    private final static QName _UriContentBlobContentUri_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ContentUri");
    private final static QName _GetDataVersion_QNAME = new QName("http://tempuri.org/", "version");
    private final static QName _ImportDetails_QNAME = new QName("http://tempuri.org/", "details");
    private final static QName _ImportData_QNAME = new QName("http://tempuri.org/", "data");
    private final static QName _CommitTargetID_QNAME = new QName("http://tempuri.org/", "targetID");
    private final static QName _EditResponseEditResult_QNAME = new QName("http://tempuri.org/", "EditResult");
    private final static QName _RawContentBlobRawData_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "RawData");
    private final static QName _GetOfficialContentResponseGetOfficialContentResult_QNAME = new QName("http://tempuri.org/", "GetOfficialContentResult");
    private final static QName _CreateResponseCreateResult_QNAME = new QName("http://tempuri.org/", "CreateResult");
    private final static QName _ContentDetailsIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "Identifier");
    private final static QName _ContentDetailsPortrait_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "Portrait");
    private final static QName _ContentDetailsDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "Details");
    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");
    private final static QName _ContentIdentifierContentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ContentID");
    private final static QName _ContentIdentifierScratchID_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ScratchID");
    private final static QName _ContentIdentifierOfficialTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "OfficialTypeID");
    private final static QName _GetDeletedContentResponseGetDeletedContentResult_QNAME = new QName("http://tempuri.org/", "GetDeletedContentResult");
    private final static QName _CommitResponseCommitResult_QNAME = new QName("http://tempuri.org/", "CommitResult");
    private final static QName _RestoreBackupResponseRestoreBackupResult_QNAME = new QName("http://tempuri.org/", "RestoreBackupResult");
    private final static QName _UpdatePortraitResponseUpdatePortraitResult_QNAME = new QName("http://tempuri.org/", "UpdatePortraitResult");
    private final static QName _UpdatePortraitPortrait_QNAME = new QName("http://tempuri.org/", "portrait");
    private final static QName _IdentifierWithVersionVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "Version");
    private final static QName _DataWithVersionData_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "Data");
    private final static QName _UpdateDataResponseUpdateDataResult_QNAME = new QName("http://tempuri.org/", "UpdateDataResult");
    private final static QName _ContentInfoScratchContents_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "ScratchContents");
    private final static QName _ContentInfoCommittedContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentVault", "CommittedContent");
    private final static QName _ContentNotFoundFaultID_QNAME = new QName("http://schemas.datacontract.org/2004/07/WotC.ContentManagement", "ID");
    private final static QName _GetAvailableContentResponseGetAvailableContentResult_QNAME = new QName("http://tempuri.org/", "GetAvailableContentResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nz.co.aetheric.magus.ioun
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetAvailableContent }
     * 
     */
    public GetAvailableContent createGetAvailableContent() {
        return new GetAvailableContent();
    }

    /**
     * Create an instance of {@link GetDeletedContentResponse }
     * 
     */
    public GetDeletedContentResponse createGetDeletedContentResponse() {
        return new GetDeletedContentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfContentInfo }
     * 
     */
    public ArrayOfContentInfo createArrayOfContentInfo() {
        return new ArrayOfContentInfo();
    }

    /**
     * Create an instance of {@link Import }
     * 
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link DataWithVersion }
     * 
     */
    public DataWithVersion createDataWithVersion() {
        return new DataWithVersion();
    }

    /**
     * Create an instance of {@link GetOfficialContent }
     * 
     */
    public GetOfficialContent createGetOfficialContent() {
        return new GetOfficialContent();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link ContentIdentifier }
     * 
     */
    public ContentIdentifier createContentIdentifier() {
        return new ContentIdentifier();
    }

    /**
     * Create an instance of {@link UpdateDataResponse }
     * 
     */
    public UpdateDataResponse createUpdateDataResponse() {
        return new UpdateDataResponse();
    }

    /**
     * Create an instance of {@link GetAvailableContentResponse }
     * 
     */
    public GetAvailableContentResponse createGetAvailableContentResponse() {
        return new GetAvailableContentResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link RestoreBackupResponse }
     * 
     */
    public RestoreBackupResponse createRestoreBackupResponse() {
        return new RestoreBackupResponse();
    }

    /**
     * Create an instance of {@link GetOfficialContentResponse }
     * 
     */
    public GetOfficialContentResponse createGetOfficialContentResponse() {
        return new GetOfficialContentResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetDeletedContent }
     * 
     */
    public GetDeletedContent createGetDeletedContent() {
        return new GetDeletedContent();
    }

    /**
     * Create an instance of {@link DeleteContent }
     * 
     */
    public DeleteContent createDeleteContent() {
        return new DeleteContent();
    }

    /**
     * Create an instance of {@link RestoreBackup }
     * 
     */
    public RestoreBackup createRestoreBackup() {
        return new RestoreBackup();
    }

    /**
     * Create an instance of {@link GetUserID }
     * 
     */
    public GetUserID createGetUserID() {
        return new GetUserID();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link Commit }
     * 
     */
    public Commit createCommit() {
        return new Commit();
    }

    /**
     * Create an instance of {@link CommitResponse }
     * 
     */
    public CommitResponse createCommitResponse() {
        return new CommitResponse();
    }

    /**
     * Create an instance of {@link IdentifierWithVersion }
     * 
     */
    public IdentifierWithVersion createIdentifierWithVersion() {
        return new IdentifierWithVersion();
    }

    /**
     * Create an instance of {@link GetUserIDResponse }
     * 
     */
    public GetUserIDResponse createGetUserIDResponse() {
        return new GetUserIDResponse();
    }

    /**
     * Create an instance of {@link EditResponse }
     * 
     */
    public EditResponse createEditResponse() {
        return new EditResponse();
    }

    /**
     * Create an instance of {@link ImportResponse }
     * 
     */
    public ImportResponse createImportResponse() {
        return new ImportResponse();
    }

    /**
     * Create an instance of {@link UndeleteContent }
     * 
     */
    public UndeleteContent createUndeleteContent() {
        return new UndeleteContent();
    }

    /**
     * Create an instance of {@link UpdatePortraitResponse }
     * 
     */
    public UpdatePortraitResponse createUpdatePortraitResponse() {
        return new UpdatePortraitResponse();
    }

    /**
     * Create an instance of {@link UndeleteContentResponse }
     * 
     */
    public UndeleteContentResponse createUndeleteContentResponse() {
        return new UndeleteContentResponse();
    }

    /**
     * Create an instance of {@link DeleteContentResponse }
     * 
     */
    public DeleteContentResponse createDeleteContentResponse() {
        return new DeleteContentResponse();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link UpdatePortrait }
     * 
     */
    public UpdatePortrait createUpdatePortrait() {
        return new UpdatePortrait();
    }

    /**
     * Create an instance of {@link ContentBlob }
     * 
     */
    public ContentBlob createContentBlob() {
        return new ContentBlob();
    }

    /**
     * Create an instance of {@link UpdateData }
     * 
     */
    public UpdateData createUpdateData() {
        return new UpdateData();
    }

    /**
     * Create an instance of {@link ContentDetails }
     * 
     */
    public ContentDetails createContentDetails() {
        return new ContentDetails();
    }

    /**
     * Create an instance of {@link RawContentBlob }
     * 
     */
    public RawContentBlob createRawContentBlob() {
        return new RawContentBlob();
    }

    /**
     * Create an instance of {@link ContentInfo }
     * 
     */
    public ContentInfo createContentInfo() {
        return new ContentInfo();
    }

    /**
     * Create an instance of {@link ArrayOfContentDetails }
     * 
     */
    public ArrayOfContentDetails createArrayOfContentDetails() {
        return new ArrayOfContentDetails();
    }

    /**
     * Create an instance of {@link UriContentBlob }
     * 
     */
    public UriContentBlob createUriContentBlob() {
        return new UriContentBlob();
    }

    /**
     * Create an instance of {@link TooMuchContentFault }
     * 
     */
    public TooMuchContentFault createTooMuchContentFault() {
        return new TooMuchContentFault();
    }

    /**
     * Create an instance of {@link TooMuchScratchFault }
     * 
     */
    public TooMuchScratchFault createTooMuchScratchFault() {
        return new TooMuchScratchFault();
    }

    /**
     * Create an instance of {@link ContentNotFoundFault }
     * 
     */
    public ContentNotFoundFault createContentNotFoundFault() {
        return new ContentNotFoundFault();
    }

    /**
     * Create an instance of {@link NotifyPropertyChangedBase }
     * 
     */
    public NotifyPropertyChangedBase createNotifyPropertyChangedBase() {
        return new NotifyPropertyChangedBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWithVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "DataWithVersion")
    public JAXBElement<DataWithVersion> createDataWithVersion(DataWithVersion value) {
        return new JAXBElement<DataWithVersion>(_DataWithVersion_QNAME, DataWithVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ArrayOfContentDetails")
    public JAXBElement<ArrayOfContentDetails> createArrayOfContentDetails(ArrayOfContentDetails value) {
        return new JAXBElement<ArrayOfContentDetails>(_ArrayOfContentDetails_QNAME, ArrayOfContentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriContentBlob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "UriContentBlob")
    public JAXBElement<UriContentBlob> createUriContentBlob(UriContentBlob value) {
        return new JAXBElement<UriContentBlob>(_UriContentBlob_QNAME, UriContentBlob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentNotFoundFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement", name = "ContentNotFoundFault")
    public JAXBElement<ContentNotFoundFault> createContentNotFoundFault(ContentNotFoundFault value) {
        return new JAXBElement<ContentNotFoundFault>(_ContentNotFoundFault_QNAME, ContentNotFoundFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ContentDetails")
    public JAXBElement<ContentDetails> createContentDetails(ContentDetails value) {
        return new JAXBElement<ContentDetails>(_ContentDetails_QNAME, ContentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TooMuchContentFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement", name = "TooMuchContentFault")
    public JAXBElement<TooMuchContentFault> createTooMuchContentFault(TooMuchContentFault value) {
        return new JAXBElement<TooMuchContentFault>(_TooMuchContentFault_QNAME, TooMuchContentFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ArrayOfContentInfo")
    public JAXBElement<ArrayOfContentInfo> createArrayOfContentInfo(ArrayOfContentInfo value) {
        return new JAXBElement<ArrayOfContentInfo>(_ArrayOfContentInfo_QNAME, ArrayOfContentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RawContentBlob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "RawContentBlob")
    public JAXBElement<RawContentBlob> createRawContentBlob(RawContentBlob value) {
        return new JAXBElement<RawContentBlob>(_RawContentBlob_QNAME, RawContentBlob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierWithVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "IdentifierWithVersion")
    public JAXBElement<IdentifierWithVersion> createIdentifierWithVersion(IdentifierWithVersion value) {
        return new JAXBElement<IdentifierWithVersion>(_IdentifierWithVersion_QNAME, IdentifierWithVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyPropertyChangedBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.XAMLUtilities", name = "NotifyPropertyChangedBase")
    public JAXBElement<NotifyPropertyChangedBase> createNotifyPropertyChangedBase(NotifyPropertyChangedBase value) {
        return new JAXBElement<NotifyPropertyChangedBase>(_NotifyPropertyChangedBase_QNAME, NotifyPropertyChangedBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ContentIdentifier")
    public JAXBElement<ContentIdentifier> createContentIdentifier(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_ContentIdentifier_QNAME, ContentIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ContentInfo")
    public JAXBElement<ContentInfo> createContentInfo(ContentInfo value) {
        return new JAXBElement<ContentInfo>(_ContentInfo_QNAME, ContentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ContentBlob")
    public JAXBElement<ContentBlob> createContentBlob(ContentBlob value) {
        return new JAXBElement<ContentBlob>(_ContentBlob_QNAME, ContentBlob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TooMuchScratchFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement", name = "TooMuchScratchFault")
    public JAXBElement<TooMuchScratchFault> createTooMuchScratchFault(TooMuchScratchFault value) {
        return new JAXBElement<TooMuchScratchFault>(_TooMuchScratchFault_QNAME, TooMuchScratchFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserContentRights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement", name = "UserContentRights")
    public JAXBElement<UserContentRights> createUserContentRights(UserContentRights value) {
        return new JAXBElement<UserContentRights>(_UserContentRights_QNAME, UserContentRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = UndeleteContent.class)
    public JAXBElement<ContentIdentifier> createUndeleteContentId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, UndeleteContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = DeleteContent.class)
    public JAXBElement<ContentIdentifier> createDeleteContentId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, DeleteContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = Edit.class)
    public JAXBElement<ContentIdentifier> createEditId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, Edit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<byte[]> createLoginPassword(byte[] value) {
        return new JAXBElement<byte[]>(_LoginPassword_QNAME, byte[].class, Login.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = Login.class)
    public JAXBElement<String> createLoginUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierWithVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ImportResult", scope = ImportResponse.class)
    public JAXBElement<IdentifierWithVersion> createImportResponseImportResult(IdentifierWithVersion value) {
        return new JAXBElement<IdentifierWithVersion>(_ImportResponseImportResult_QNAME, IdentifierWithVersion.class, ImportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ContentUri", scope = UriContentBlob.class)
    public JAXBElement<String> createUriContentBlobContentUri(String value) {
        return new JAXBElement<String>(_UriContentBlobContentUri_QNAME, String.class, UriContentBlob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = GetData.class)
    public JAXBElement<ContentIdentifier> createGetDataId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, GetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "version", scope = GetData.class)
    public JAXBElement<byte[]> createGetDataVersion(byte[] value) {
        return new JAXBElement<byte[]>(_GetDataVersion_QNAME, byte[].class, GetData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "details", scope = Import.class)
    public JAXBElement<String> createImportDetails(String value) {
        return new JAXBElement<String>(_ImportDetails_QNAME, String.class, Import.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "data", scope = Import.class)
    public JAXBElement<byte[]> createImportData(byte[] value) {
        return new JAXBElement<byte[]>(_ImportData_QNAME, byte[].class, Import.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "targetID", scope = Commit.class)
    public JAXBElement<ContentIdentifier> createCommitTargetID(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_CommitTargetID_QNAME, ContentIdentifier.class, Commit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = Commit.class)
    public JAXBElement<ContentIdentifier> createCommitId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, Commit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EditResult", scope = EditResponse.class)
    public JAXBElement<ContentIdentifier> createEditResponseEditResult(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_EditResponseEditResult_QNAME, ContentIdentifier.class, EditResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "RawData", scope = RawContentBlob.class)
    public JAXBElement<byte[]> createRawContentBlobRawData(byte[] value) {
        return new JAXBElement<byte[]>(_RawContentBlobRawData_QNAME, byte[].class, RawContentBlob.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetOfficialContentResult", scope = GetOfficialContentResponse.class)
    public JAXBElement<ArrayOfContentInfo> createGetOfficialContentResponseGetOfficialContentResult(ArrayOfContentInfo value) {
        return new JAXBElement<ArrayOfContentInfo>(_GetOfficialContentResponseGetOfficialContentResult_QNAME, ArrayOfContentInfo.class, GetOfficialContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreateResult", scope = CreateResponse.class)
    public JAXBElement<ContentIdentifier> createCreateResponseCreateResult(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_CreateResponseCreateResult_QNAME, ContentIdentifier.class, CreateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "details", scope = UpdateData.class)
    public JAXBElement<String> createUpdateDataDetails(String value) {
        return new JAXBElement<String>(_ImportDetails_QNAME, String.class, UpdateData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = UpdateData.class)
    public JAXBElement<ContentIdentifier> createUpdateDataId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, UpdateData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "data", scope = UpdateData.class)
    public JAXBElement<byte[]> createUpdateDataData(byte[] value) {
        return new JAXBElement<byte[]>(_ImportData_QNAME, byte[].class, UpdateData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "Identifier", scope = ContentDetails.class)
    public JAXBElement<ContentIdentifier> createContentDetailsIdentifier(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_ContentDetailsIdentifier_QNAME, ContentIdentifier.class, ContentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "Portrait", scope = ContentDetails.class)
    public JAXBElement<ContentBlob> createContentDetailsPortrait(ContentBlob value) {
        return new JAXBElement<ContentBlob>(_ContentDetailsPortrait_QNAME, ContentBlob.class, ContentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "Details", scope = ContentDetails.class)
    public JAXBElement<String> createContentDetailsDetails(String value) {
        return new JAXBElement<String>(_ContentDetailsDetails_QNAME, String.class, ContentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataWithVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<DataWithVersion> createGetDataResponseGetDataResult(DataWithVersion value) {
        return new JAXBElement<DataWithVersion>(_GetDataResponseGetDataResult_QNAME, DataWithVersion.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ContentID", scope = ContentIdentifier.class)
    public JAXBElement<Integer> createContentIdentifierContentID(Integer value) {
        return new JAXBElement<Integer>(_ContentIdentifierContentID_QNAME, Integer.class, ContentIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ScratchID", scope = ContentIdentifier.class)
    public JAXBElement<Integer> createContentIdentifierScratchID(Integer value) {
        return new JAXBElement<Integer>(_ContentIdentifierScratchID_QNAME, Integer.class, ContentIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "OfficialTypeID", scope = ContentIdentifier.class)
    public JAXBElement<Integer> createContentIdentifierOfficialTypeID(Integer value) {
        return new JAXBElement<Integer>(_ContentIdentifierOfficialTypeID_QNAME, Integer.class, ContentIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDeletedContentResult", scope = GetDeletedContentResponse.class)
    public JAXBElement<ArrayOfContentInfo> createGetDeletedContentResponseGetDeletedContentResult(ArrayOfContentInfo value) {
        return new JAXBElement<ArrayOfContentInfo>(_GetDeletedContentResponseGetDeletedContentResult_QNAME, ArrayOfContentInfo.class, GetDeletedContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierWithVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CommitResult", scope = CommitResponse.class)
    public JAXBElement<IdentifierWithVersion> createCommitResponseCommitResult(IdentifierWithVersion value) {
        return new JAXBElement<IdentifierWithVersion>(_CommitResponseCommitResult_QNAME, IdentifierWithVersion.class, CommitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RestoreBackupResult", scope = RestoreBackupResponse.class)
    public JAXBElement<byte[]> createRestoreBackupResponseRestoreBackupResult(byte[] value) {
        return new JAXBElement<byte[]>(_RestoreBackupResponseRestoreBackupResult_QNAME, byte[].class, RestoreBackupResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdatePortraitResult", scope = UpdatePortraitResponse.class)
    public JAXBElement<byte[]> createUpdatePortraitResponseUpdatePortraitResult(byte[] value) {
        return new JAXBElement<byte[]>(_UpdatePortraitResponseUpdatePortraitResult_QNAME, byte[].class, UpdatePortraitResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = UpdatePortrait.class)
    public JAXBElement<ContentIdentifier> createUpdatePortraitId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, UpdatePortrait.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "portrait", scope = UpdatePortrait.class)
    public JAXBElement<ContentBlob> createUpdatePortraitPortrait(ContentBlob value) {
        return new JAXBElement<ContentBlob>(_UpdatePortraitPortrait_QNAME, ContentBlob.class, UpdatePortrait.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "Version", scope = IdentifierWithVersion.class)
    public JAXBElement<byte[]> createIdentifierWithVersionVersion(byte[] value) {
        return new JAXBElement<byte[]>(_IdentifierWithVersionVersion_QNAME, byte[].class, IdentifierWithVersion.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "Identifier", scope = IdentifierWithVersion.class)
    public JAXBElement<ContentIdentifier> createIdentifierWithVersionIdentifier(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_ContentDetailsIdentifier_QNAME, ContentIdentifier.class, IdentifierWithVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "id", scope = RestoreBackup.class)
    public JAXBElement<ContentIdentifier> createRestoreBackupId(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_UndeleteContentId_QNAME, ContentIdentifier.class, RestoreBackup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "Version", scope = DataWithVersion.class)
    public JAXBElement<byte[]> createDataWithVersionVersion(byte[] value) {
        return new JAXBElement<byte[]>(_IdentifierWithVersionVersion_QNAME, byte[].class, DataWithVersion.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "Data", scope = DataWithVersion.class)
    public JAXBElement<ContentBlob> createDataWithVersionData(ContentBlob value) {
        return new JAXBElement<ContentBlob>(_DataWithVersionData_QNAME, ContentBlob.class, DataWithVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateDataResult", scope = UpdateDataResponse.class)
    public JAXBElement<byte[]> createUpdateDataResponseUpdateDataResult(byte[] value) {
        return new JAXBElement<byte[]>(_UpdateDataResponseUpdateDataResult_QNAME, byte[].class, UpdateDataResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "ScratchContents", scope = ContentInfo.class)
    public JAXBElement<ArrayOfContentDetails> createContentInfoScratchContents(ArrayOfContentDetails value) {
        return new JAXBElement<ArrayOfContentDetails>(_ContentInfoScratchContents_QNAME, ArrayOfContentDetails.class, ContentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", name = "CommittedContent", scope = ContentInfo.class)
    public JAXBElement<ContentDetails> createContentInfoCommittedContent(ContentDetails value) {
        return new JAXBElement<ContentDetails>(_ContentInfoCommittedContent_QNAME, ContentDetails.class, ContentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement", name = "ID", scope = ContentNotFoundFault.class)
    public JAXBElement<ContentIdentifier> createContentNotFoundFaultID(ContentIdentifier value) {
        return new JAXBElement<ContentIdentifier>(_ContentNotFoundFaultID_QNAME, ContentIdentifier.class, ContentNotFoundFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAvailableContentResult", scope = GetAvailableContentResponse.class)
    public JAXBElement<ArrayOfContentInfo> createGetAvailableContentResponseGetAvailableContentResult(ArrayOfContentInfo value) {
        return new JAXBElement<ArrayOfContentInfo>(_GetAvailableContentResponseGetAvailableContentResult_QNAME, ArrayOfContentInfo.class, GetAvailableContentResponse.class, value);
    }

}
