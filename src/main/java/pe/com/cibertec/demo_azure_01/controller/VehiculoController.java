package pe.com.cibertec.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.cibertec.demo_azure_01.viewmodel.VehiculoModel;

import java.util.ArrayList;
import java.util.List;

@Controller

public class VehiculoController {

    @GetMapping("/")
    public String obtenerVehiculos(Model model) {

        List<VehiculoModel> listavehiculos = new ArrayList<VehiculoModel>();
        listavehiculos.add(new VehiculoModel(1, "toyota", "Corolla", "rojo", "ABC-123"));
        listavehiculos.add(new VehiculoModel(2, "chevrolet", "Spark", "azul", "DEF-456"));
        listavehiculos.add(new VehiculoModel(3, "ford", "Mustang", "negro", "GHI-789"));
        listavehiculos.add(new VehiculoModel(4, "Great Wall", "C30", "plata", "BBY-252"));
        listavehiculos.add(new VehiculoModel(5, "BMW", "5 Series", "verde", "CCC-369"));

        model.addAttribute("listavehiculos", listavehiculos);
        return "vehiculo";
    }
}
