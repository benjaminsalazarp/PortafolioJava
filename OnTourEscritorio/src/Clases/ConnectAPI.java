/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.*;
import java.net.*;
import javax.net.*;
import com.google.gson.Gson;
import Clases.Cuenta;
import Clases.Actividad;
import Clases.Destinos;


import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Ramirez
 */
public class ConnectAPI {
    Cuenta u = null;
    
    
    public String Peticion(String url, String urlParameters, String method) throws MalformedURLException, ProtocolException, IOException{
    
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod(method);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        StringBuffer response = null;
        String responseResponse = null;
        
        try{
        
            // Send post request
          
            if(method.compareToIgnoreCase("get") != 0){
             con.setDoOutput(true);
             DataOutputStream wr = new DataOutputStream(con.getOutputStream());
             wr.writeBytes(urlParameters);
             wr.flush();
             wr.close();
             
             }

            int responseCode = con.getResponseCode();
            System.out.println("\nSending ''"+method+" request to URL : " + url);
            System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);

            if(responseCode != 200){
                System.out.println("Error");
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getErrorStream()));
                String inputLine;
                response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                }
                in.close();
                System.out.println(response);
            }else{
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
                String inputLine;
                response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                }
                in.close();
                System.out.println("exito");
                System.out.println(response.toString());
                responseResponse = response.toString();
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return responseResponse;
        
    }
    //LOG IN
    public Cuenta Iniciar(String user, String pass){
    
        Gson g = new Gson();
        Cuenta u = null;
        
        String url = "https://thawing-forest-71712.herokuapp.com/api/iniciar";
        String urlParameters = "email="+user+"&password="+pass;
        String method = "POST";
        
        String response = null;
        
        try{
            response = Peticion(url, urlParameters, method);
            
            if(response != null){
                u = g.fromJson(response.toString(), Cuenta.class);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return u;
        
    }
    //CUENTA
    public Cuenta RegistrarCuenta(String rut, String nombre, String apellido_p,String apellido_m, String sexo,String email,
            String telefono, String celular, String password, String rol_id)
    {
        Gson g = new Gson();
        Cuenta c = null;
        
        String url = "https://thawing-forest-71712.herokuapp.com/api/cuentas";
        String urlParameters= "rut="+rut+"&nombre="+nombre+"&apellido_p="+apellido_p+"&apellido_m="+apellido_m+"&sexo="+
                                sexo+"&email="+email+"&telefono="+telefono+"&celular="+celular+"&password="+password+"&rol_id="+rol_id;
        String method = "POST";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response != null){
                c = g.fromJson(response.toString(), Cuenta.class);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return c;
    }
    
    
    public Cuenta[] listarCuentas()
    {
       Gson g = new Gson();
       Cuenta[] c = null;
       String url="https://thawing-forest-71712.herokuapp.com/api/cuentas";
       String urlParameters="";
       String method = "GET";
       
       String response = null;
       try{
           response = Peticion(url, urlParameters, method);
                   if(response != null)
                   {
                       c = g.fromJson(response.toString(),Cuenta[].class);
                       System.out.println(c);
                   }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return c;
    }
    
    
    public Boolean actualizar(String cuenta_id,String rut, String nombre, String apellido_p,String apellido_m, String sexo,String email,
            String telefono, String celular, String rol_id)
    {
       
        
        String url = "https://thawing-forest-71712.herokuapp.com/api/cuentas/"+cuenta_id;
        String urlParameters= "rut="+rut+"&nombre="+nombre+"&apellido_p="+apellido_p+"&apellido_m="+apellido_m+"&sexo="+
                                sexo+"&email="+email+"&telefono="+telefono+"&celular="+celular+"&rol_id="+rol_id;
        String method = "PUT";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response.equalsIgnoreCase("true")){
              return true;
            }else{
                return false;
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    
    public Boolean eliminar(String cuenta_id)
    {
                String url = "https://thawing-forest-71712.herokuapp.com/api/cuentas/"+cuenta_id;
        String urlParameters= "";
        String method = "DELETE";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response.equalsIgnoreCase("true")){
              return true;
            }else{
                return false;
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    //ACTIVIDAD
    public Actividad agregarActividad(String nombre_Actividad)
    {
        Gson g = new Gson();
        Actividad a = null;
        
        String url = "https://thawing-forest-71712.herokuapp.com/api/actividades";
        String urlParameters= "nombre="+nombre_Actividad;
        String method = "POST";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response != null){
                a = g.fromJson(response.toString(), Actividad.class);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return a;
    }
  
    public Boolean eliminarActividad(String actividad_id)
    {
        String url = "https://thawing-forest-71712.herokuapp.com/api/actividades/"+actividad_id;
        String urlParameters= "";
        String method = "DELETE";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response.equalsIgnoreCase("true")){
              return true;
            }else{
                return false;
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
    
     public Actividad[] listarActividades()
    {
       Gson g = new Gson();
       Actividad[] ac = null;
       String url="https://thawing-forest-71712.herokuapp.com/api/actividades";
       String urlParameters="";
       String method = "GET";
       
       String response = null;
       try{
           response = Peticion(url, urlParameters, method);
                   if(response != null)
                   {
                       ac = g.fromJson(response.toString(),Actividad[].class);
                       System.out.println(ac);
                   }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return ac;
    }
     
     
     public Actividad consultarActividad(String actividad_id)
    {
       Gson g = new Gson();
       Actividad ac = null;
       String url="https://thawing-forest-71712.herokuapp.com/api/actividades/"+actividad_id;
       String urlParameters="";
       String method = "GET";
       
       String response = null;
       try{
           response = Peticion(url, urlParameters, method);
                   if(response != null)
                   {
                       ac = g.fromJson(response.toString(),Actividad.class);
                       System.out.println(ac);
                   }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return ac;
    }
     
     
     //Escuelas
     
     public Escuela agregarEscuela(String nombre,String ciudad,String region_id)
     {
        Gson g = new Gson();
        Escuela es = null;
        
        String url = "https://thawing-forest-71712.herokuapp.com/api/escuelas";
        String urlParameters= "nombre="+nombre+"&ciudad="+ciudad+"&region_id="+region_id;
        String method = "POST";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response != null){
                es = g.fromJson(response.toString(), Escuela.class);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return es;
     }
        
        
    public Boolean eliminarEscuela(String escuela_id)
    {
        String url = "https://thawing-forest-71712.herokuapp.com/api/escuelas/"+escuela_id;
        String urlParameters= "";
        String method = "DELETE";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response.equalsIgnoreCase("true")){
              return true;
            }else{
                return false;
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    public Escuela[] listarEscuelas()
    {
       Gson g = new Gson();
       Escuela[] es = null;
       String url="https://thawing-forest-71712.herokuapp.com/api/escuelas";
       String urlParameters="";
       String method = "GET";
       
       String response = null;
       try{
           response = Peticion(url, urlParameters, method);
                   if(response != null)
                   {
                       es = g.fromJson(response.toString(),Escuela[].class);
                       System.out.println(es);
                   }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return es;
    }
    
    
    
     public Escuela consultarEscuela(String escuela_id)
    {
       Gson g = new Gson();
       Escuela es = null;
       String url="https://thawing-forest-71712.herokuapp.com/api/escuelas/"+escuela_id;
       String urlParameters="";
       String method = "GET";
       
       String response = null;
       try{
           response = Peticion(url, urlParameters, method);
                   if(response != null)
                   {
                       es = g.fromJson(response.toString(),Escuela.class);
                       System.out.println(es);
                   }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return es;
    }
     
     
     //DESTINOS
     public Destinos agregarDestino(String nombre)
     {
        Gson g = new Gson();
        Destinos des = null;
        
        String url = "https://thawing-forest-71712.herokuapp.com/api/destinos";
        String urlParameters= "nombre="+nombre;
        String method = "POST";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response != null){
                des = g.fromJson(response.toString(), Destinos.class);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return des;
     }
     
     public Boolean eliminarDestino(String id)
    {
        String url = "https://thawing-forest-71712.herokuapp.com/api/destinos/"+id;
        String urlParameters= "";
        String method = "DELETE";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response.equalsIgnoreCase("true")){
              return true;
            }else{
                return false;
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
     
     
     public Destinos[] listarDestinos()
    {
       Gson g = new Gson();
       Destinos[] des = null;
       String url="https://thawing-forest-71712.herokuapp.com/api/destinos";
       String urlParameters="";
       String method = "GET";
       
       String response = null;
       try{
           response = Peticion(url, urlParameters, method);
                   if(response != null)
                   {
                       des = g.fromJson(response.toString(),Destinos[].class);
                       System.out.println(des);
                   }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return des;
    }
     
     
     
     
     public Destinos consultarDestino(String id)
    {
       Gson g = new Gson();
       Destinos des = null;
       String url="https://thawing-forest-71712.herokuapp.com/api/destinos/"+id;
       String urlParameters="";
       String method = "GET";
       
       String response = null;
       try{
           response = Peticion(url, urlParameters, method);
                   if(response != null)
                   {
                       des = g.fromJson(response.toString(),Destinos.class);
                       System.out.println(des);
                   }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return des;
    }
     
     
     //CURSO
     
      public Curso agregarCurso(String cuenta_id, String escuela_id, String destino_id, String monto_meta, String nivel,String anio, String fecha_viaje)
     {
        Gson g = new Gson();
        
        Curso curso = null;
        
        String url = "https://thawing-forest-71712.herokuapp.com/api/destinos";
        String urlParameters= "cuenta_id="+cuenta_id+"&escuela_id="+escuela_id+"&destino_id="+destino_id+"&monto_meta="+monto_meta+"&nivel="+nivel+"&anio="+anio+"fecha_viaje="+fecha_viaje;
        String method = "POST";
        
        String response = null;
        try
        {
            response = Peticion(url, urlParameters, method);
            if(response != null){
                curso = g.fromJson(response.toString(), Curso.class);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return curso;
     }
     

}
