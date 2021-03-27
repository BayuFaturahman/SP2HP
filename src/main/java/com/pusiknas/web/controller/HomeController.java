package com.pusiknas.web.controller;



import com.pusiknas.web.entity.mahasiswaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.pusiknas.web.service.MahasiswaService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
public abstract class HomeController extends AbstractController  {

    @Autowired
    private MahasiswaService mahasiswaService;

    @RequestMapping("/mhs")
    public String mhs(Model model, HttpServletRequest request) {

        List<mahasiswaEntity> mhs = mahasiswaService.getListMahasiwa();
        System.out.println("data" + " " + mhs);
      

        model.addAttribute("mhs", mhs);
        return "mhs";
    }    
             

        
    }

     
//    @GetMapping(value = {"/"})
//    public String masuk() {
//        return "login";
//    }
//
//    private Map GET(String url) {
//
//        Gson gson = new Gson();
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .readTimeout(120, TimeUnit.SECONDS)
//                .build();
//        MediaType mediaType = MediaType.parse("application/json");
//        Request request = new Request.Builder()
//                .url(url)
//                .get()
//                .build();
//        try {
//            okhttp3.Response response = client.newCall(request).execute();
//            return gson.fromJson(response.body().string(), Map.class);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new HashMap();
//
//    }
//
////      
//    @GetMapping(value = "/cari")
//    @ResponseBody
//    public String cari(Model model, @RequestParam(required = false) String noLp, String nama, String tanggalLahir, HttpServletRequest request) {
//
//        String cIpAccess = request.getRemoteAddr();
//        Map<String, String> getBerkas = GET(env.getProperty("srv.pengolahanDataBerkas.link") + "?no_lp=" + noLp + "&nama_pelapor=" + nama + "&tgl_lahir_pelapor=" + tanggalLahir + "&ip_user=" + cIpAccess);
//
//        String data = getBerkas.get("value");
//        String dataEror = getBerkas.get("message");
//        if (data == null) {
//            data = dataEror;
//        }
//
//        if (!data.isEmpty()) {
//            return data;
//        } else {
//
//            System.out.println("test " + dataEror);
//            return dataEror;
//        }
//    }
//
//    @PostMapping(value = "/rating")
//    @ResponseBody
//    public String rating(@RequestParam(required = false) String noLp, String rating, HttpServletRequest request1) throws IOException {
//                OkHttpClient client = new OkHttpClient();
//
//        String cIpAccess = request1.getRemoteAddr();
////    Map<String, String> getBerkas = POST(env.getProperty("srv.rating.link") + "?no_lp=" + noLp + "&rating=" + rating + "&ip_user=" + cIpAccess);
//   
//        RequestBody formBody = new FormBody.Builder()
//      .add("no_lp", noLp)
//      .add("rating", rating)
//      .add("ip_user", cIpAccess)
//      .build();
//
//    Request request = new Request.Builder()
//      .url(env.getProperty("srv.rating.link"))
//      .post(formBody)
//      .build();
//
//    Call call = client.newCall(request);
//    Response response = call.execute();
//  
//        return response.body().string();
//    }


