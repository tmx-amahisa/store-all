package jp.co.techmatrix.store.services.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2016-02-19T15:09:51.060+09:00
 * Generated source version: 3.0.5
 * 
 */
@WebService(targetNamespace = "http://soap.services.store.techmatrix.co.jp/", name = "cart")
@XmlSeeAlso({ObjectFactory.class})
public interface Cart {

    @WebMethod
    @RequestWrapper(localName = "login", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.LoginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean login(
        @WebParam(name = "arg0", targetNamespace = "")
        jp.co.techmatrix.store.services.soap.User arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addRegisterOperation", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.AddRegisterOperation")
    @ResponseWrapper(localName = "addRegisterOperationResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.AddRegisterOperationResponse")
    public void addRegisterOperation(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<jp.co.techmatrix.store.services.soap.OrderLine> arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getItemByTitleOperation", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.GetItemByTitleOperation")
    @ResponseWrapper(localName = "getItemByTitleOperationResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.GetItemByTitleOperationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<jp.co.techmatrix.store.services.soap.Book> getItemByTitleOperation(
        @WebParam(name = "title", targetNamespace = "")
        java.lang.String title
    );

    @WebMethod
    @RequestWrapper(localName = "addNewBookOperation", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.AddNewBookOperation")
    @ResponseWrapper(localName = "addNewBookOperationResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.AddNewBookOperationResponse")
    public void addNewBookOperation(
        @WebParam(name = "book", targetNamespace = "")
        jp.co.techmatrix.store.services.soap.Book book
    );

    @WebMethod
    @RequestWrapper(localName = "getItemByIdOperation", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.GetItemByIdOperation")
    @ResponseWrapper(localName = "getItemByIdOperationResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.GetItemByIdOperationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public jp.co.techmatrix.store.services.soap.Book getItemByIdOperation(
        @WebParam(name = "id", targetNamespace = "")
        int id
    );

    @WebMethod
    @RequestWrapper(localName = "deleteBookOperation", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.DeleteBookOperation")
    @ResponseWrapper(localName = "deleteBookOperationResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.DeleteBookOperationResponse")
    public void deleteBookOperation(
        @WebParam(name = "id", targetNamespace = "")
        int id
    );

    @WebMethod
    @RequestWrapper(localName = "removeRegister", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.RemoveRegister")
    @ResponseWrapper(localName = "removeRegisterResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.RemoveRegisterResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<jp.co.techmatrix.store.services.soap.OrderLine> removeRegister(
        @WebParam(name = "arg0", targetNamespace = "")
        jp.co.techmatrix.store.services.soap.User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebMethod
    @RequestWrapper(localName = "getAllRegister", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.GetAllRegister")
    @ResponseWrapper(localName = "getAllRegisterResponse", targetNamespace = "http://soap.services.store.techmatrix.co.jp/", className = "jp.co.techmatrix.store.services.soap.GetAllRegisterResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<jp.co.techmatrix.store.services.soap.OrderLine> getAllRegister(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}
