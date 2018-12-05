package com.afif.SpringBootWeb.controller;


import com.afif.SpringBootWeb.model.AdminAccess;
import com.afif.SpringBootWeb.repository.PegawaiRepository;
import com.afif.SpringBootWeb.service.ApkService;
import com.afif.SpringBootWeb.model.Pegawai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    private ApkService apkService;

    @Autowired
    private PegawaiRepository pegawaiRepository;


    @GetMapping("/homeapk")
    public String homeapk() {
        return "/pegawai/home";
    }

    @GetMapping("/manage")
    public String manage() {
        return "/pegawai/manage";
    }

    @GetMapping("/manage/tampilform")
    public String tampilForm(Model model) {
        model.addAttribute("pegawai", new Pegawai());
        return "/pegawai/newpegawaiForm";
    }

    @GetMapping("/apk")
    public String start (){
        return "startpage";
    }

    @GetMapping("/entercaripegawai")
    public String caripegawai() {
        return "/pegawai/entercaripegawai";
    }

    @GetMapping("/entercariusul")
    public String formcariusul() {
        return "/usulan/enternipcetak";
    }

    @GetMapping("/uruskartu")
    public String uruskartu(){
        return "/usulan/uruskartu";
    }

    @GetMapping("/usulkategori")
    public String usulkategori(){
        return "/usulan/usulkategori";
    }

    @PostMapping("/manage/save")
    public String savepegawai(@ModelAttribute Pegawai pegawai, HttpServletRequest request) {

        apkService.save(pegawai);
        request.setAttribute("mode", "MODE_PEGAWAIS");
        return "/pegawai/update";
    }

    @PostMapping("/caripegawai")
    public String caripegawai(@RequestParam(name = "s") String s, Model model){

        if (s != null){
            model.addAttribute("pegawai", apkService.caripegawai(s));
            return "/pegawai/update";
        }

        model.addAttribute("invalidCredentials", true);
        return "/pegawai/enterNipForm";
    }

    @PostMapping("/cariusulan")
    public String caruUsul(@RequestParam(name = "s") String s, Model model) {
        String pria = "1";
        String wanita = "2";
        char index = s.charAt(14);
        String compare = Character.toString(index);

        if (s != null) {
            if (compare.equals(pria)) {
                model.addAttribute("usulkartu", apkService.cariusul(s));
                return "/pegawai/kartuPria";
            }
            else if (compare.equals(wanita)){
                model.addAttribute("usulkartu", apkService.cariusul(s));
                return "/pegawai/kartuWanita";
            }
        }

        model.addAttribute("invalidCredentials",true);
        return "/pegawai/entercariusul";
    }


    @PostMapping("/apk/login")
    public String AdminLogin(@RequestParam (name = "username") String username,@RequestParam (name = "password") String password, Model model){

        AdminAccess adminAccess = new AdminAccess();

        String u = adminAccess.getUsername();
        String p = adminAccess.getPassword();

        if (username.equals(u) && password.equals(p)){
            return "/pegawai/home";
        }

        model.addAttribute("invalidCredentials", true);
        return start();

    }

    @GetMapping("/cetakKarpegDepan/{nip}")
    public String cetakKarpegDepan(@PathVariable String nip, Model model){
        model.addAttribute("usulkartu", apkService.cariusul(nip));
        return "/cetak/karpegdepan";
    }

    @GetMapping("/cetakKarpegBelakang/{nip}")
    public String cetakKarpegBelakang(@PathVariable String nip, Model model){
        model.addAttribute("usulkartu", apkService.cariusul(nip));
        return "/cetak/karpegbelakang";
    }

    @GetMapping("/cetakKarisDepan/{nip}")
    public String cetakKarisDepan(@PathVariable String nip, Model model){
        model.addAttribute("usulkartu", apkService.cariusul(nip));
        return "/cetak/karisdepan";
    }

    @GetMapping("/cetakKarisBelakang/{nip}")
    public String cetakKarisBelakang(@PathVariable String nip, Model model){
        model.addAttribute("usulkartu", apkService.cariusul(nip));
        return "/cetak/karisbelakang";
    }

    @GetMapping("/cetakKarsuDepan/{nip}")
    public String cetakkarsudepan(@PathVariable String nip, Model model){
        model.addAttribute("usulkartu", apkService.cariusul(nip));
        return "/cetak/karsudepan";
    }

    @GetMapping("/cetakKarsuBelakang/{nip}")
    public String cetakkarsubelakang(@PathVariable String nip, Model model){
        model.addAttribute("usulkartu", apkService.cariusul(nip));
        return "/cetak/karsubelakang";
    }

    @GetMapping("/updatepegawai/{id}")
    public String editPegawai(Model model, @PathVariable (value = "id") Integer id){
        model.addAttribute("pegawai", pegawaiRepository.findById(id));
        return "/pegawai/updateForm";
    }


}
