/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package api;
import gt.gob.mineco.model.Departamento;
import gt.gob.mineco.service.DiacoSrv;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/diaco")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class HelloWorldRest {
    
     @Inject
    private DiacoSrv diacoSrv;

           

   
     @GET
      @Path("/departamentos")
@Produces(MediaType.APPLICATION_JSON)
   public List<Departamento> getDepartamentos() {
  
  return diacoSrv.getDepartamentos();
 
  }
}
