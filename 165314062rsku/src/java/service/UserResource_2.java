/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.UserHelper;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.User;

/**
 * REST Web Service
 *
 * @author Vidoriba
 */
@Path("user1")
public class UserResource_2 {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UserResource_2
     */
    public UserResource_2() {
    }

    /**
     * Retrieves representation of an instance of service.UserResource_2
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
//
//    /**
//     * PUT method for updating or creating an instance of UserResource_2
//     * @param content representation for the resource
//     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_XML)
//    public void putXml(String content) {
//    }
    @GET
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@QueryParam("email") String email, @QueryParam("password") String password) {
        return new Gson().toJson(new UserHelper().login(email, password));
    }
//    public Response login(@QueryParam("email") String email, 
//                          @QueryParam("password") String password){
//        UserHelper helper = new UserHelper();
//        User hasil = helper.cariUser(email);
////        Gson gson = new Gson();
////        boolean hasil = helper.login(email, password);
//        return Response.status(200)
//                .entity(hasil)
//                .header("Access-Control-Allow-Origin", "*")
//                .header("Access-Control-Allow-Methods",
//                        "GET, POST, HEAD. OPTIONS, PUT")
//                .header("Access-Control-Allow-Headers",
//                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
//                .header("Access-Exposed-Headers",
//                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
//                .header("Access-Support-Credentials",
//                        "true")
//                .header("Access-Preflight-Maxage","2000")
//                .build();
//        
//}
}
