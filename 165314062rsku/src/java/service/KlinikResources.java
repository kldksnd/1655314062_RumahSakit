/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.KlinikHelper;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import pojos.Klinik;

/**
 *
 * @author MR98X
 */
@Path("Klinik")
public class KlinikResources {
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PasienResource
     */
    public KlinikResources() {
    }
    @GET
    @Produces("application/json")
    public Response getKlinik() {       
        KlinikHelper helper = new KlinikHelper();
        List<Klinik> list = helper.getKlinik();
        Gson gson = new Gson();
        return Response.status(200)        
                .entity(gson.toJson(list))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "20")
                .header("Access-Preflight-Maxage", "20")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of PasienResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
    @POST
    @Path("tambahKlinik")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response tambahKlinik(String data){
        Gson gson = new Gson();
        Klinik klinik = gson.fromJson(data,Klinik.class);
        
        KlinikHelper helper = new KlinikHelper();
        helper.tambahKlinik(
                klinik.getIdKlinik(),
                klinik.getNama(),
                klinik.getSpesialis());
       return Response
                .status(200)
                .entity(klinik)
                .build();
    }
}
