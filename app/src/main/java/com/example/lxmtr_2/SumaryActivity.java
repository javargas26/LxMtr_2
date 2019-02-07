package com.example.lxmtr_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SumaryActivity extends AppCompatActivity {

    //String informacion
    String clase_de_iluminacion, tramo, direccion_l1, direccion_l2, barrio, referencia_luxometro, condicion_atmosferica, interdistancia, ancho;
    //String L1
    String orientacion_l1, fuente_l1, apoyo_l1, longitud_l1, avance_calzada_l1, distancia_l1_borde,
            altura_montaje_l1, angulo_inclinacion_l1, tension_nominal_l1, tension_medida_l1, polucion_l1;
    //String L2
    String orientacion_l2, fuente_l2, apoyo_l2, longitud_l2, avance_calzada_l2, distancia_l2_borde,
            altura_montaje_l2, angulo_inclinacion_l2, tension_nominal_l2, tension_medida_l2, polucion_l2;

    //Coordenadas
    String latitud, longitud;

    //Nueve puntos
    String nueve_uno, nueve_dos, nueve_tres, nueve_cuatro,nueve_cinco,nueve_seis,nueve_siete,nueve_ocho,nueve_nueve;

    //Diez adyacentes
    String ady_uno, ady_dos, ady_tres, ady_cuatro,ady_cinco,ady_seis,ady_siete,ady_ocho,ady_nueve, ady_diez;

    //Diez opacentes
    String op_uno, op_dos, op_tres, op_cuatro,op_cinco,op_seis,op_siete,op_ocho,op_nueve, op_diez;

    int btn;

    //Para siguiente actividad
    String lx1_enviar, lx2_enviar,lx3_enviar,lx4_enviar,lx5_enviar,lx6_enviar,lx7_enviar,lx8_enviar,lx9_enviar, lx10_enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumary);

        //valores desde la actividad anterior
        Bundle bundle=getIntent().getExtras();
        clase_de_iluminacion= (String) bundle.get("clase_de_iluminacion");
        tramo=(String) bundle.get("tramo");
        direccion_l1=(String) bundle.get("direccion_l1");
        direccion_l2=(String) bundle.get("direccion_l2");
        barrio=(String) bundle.get("barrio");
        referencia_luxometro=(String) bundle.get("referencia_luxometro");
        condicion_atmosferica=(String) bundle.get("condicion_atmosferica");

        orientacion_l1=(String) bundle.get("orientacion_l1");
        fuente_l1=(String) bundle.get("fuente_l1");
        apoyo_l1=(String) bundle.get("apoyo_l1");
        longitud_l1=(String) bundle.get("longitud_l1");
        avance_calzada_l1=(String) bundle.get("avance_calzada_l1");
        distancia_l1_borde=(String) bundle.get("distancia_l1_borde");
        altura_montaje_l1=(String) bundle.get("altura_montaje_l1");
        angulo_inclinacion_l1=(String) bundle.get("angulo_inclinacion_l1");
        tension_nominal_l1=(String) bundle.get("tension_nominal_l1");
        tension_medida_l1=(String) bundle.get("tension_medida_l1");
        polucion_l1=(String) bundle.get("polucion_l1");

        orientacion_l2=(String) bundle.get("orientacion_l2");
        fuente_l2=(String) bundle.get("fuente_l2");
        apoyo_l2=(String) bundle.get("apoyo_l2");
        longitud_l2=(String) bundle.get("longitud_l2");
        avance_calzada_l2=(String) bundle.get("avance_calzada_l2");
        distancia_l2_borde=(String) bundle.get("distancia_l2_borde");
        altura_montaje_l2=(String) bundle.get("altura_montaje_l2");
        angulo_inclinacion_l2=(String) bundle.get("angulo_inclinacion_l2");
        tension_nominal_l2=(String) bundle.get("tension_nominal_l2");
        tension_medida_l2=(String) bundle.get("tension_medida_l2");
        polucion_l2=(String) bundle.get("polucion_l2");

        interdistancia=(String) bundle.get("interdistancia");
        ancho=(String) bundle.get("ancho_calzada");

        latitud=(String) bundle.get("latitud");
        longitud=(String) bundle.get("longitud");

        nueve_uno=(String)bundle.get("nueve_uno");
        nueve_dos=(String)bundle.get("nueve_dos");
        nueve_tres=(String)bundle.get("nueve_tres");
        nueve_cuatro=(String)bundle.get("nueve_cuatro");
        nueve_cinco=(String)bundle.get("nueve_cinco");
        nueve_seis=(String)bundle.get("nueve_seis");
        nueve_siete=(String)bundle.get("nueve_siete");
        nueve_ocho=(String)bundle.get("nueve_ocho");
        nueve_nueve=(String)bundle.get("nueve_nueve");

        ady_uno=(String)bundle.get("ady_uno");
        ady_dos=(String)bundle.get("ady_dos");
        ady_tres=(String)bundle.get("ady_tres");
        ady_cuatro=(String)bundle.get("ady_cuatro");
        ady_cinco=(String)bundle.get("ady_cinco");
        ady_seis=(String)bundle.get("ady_seis");
        ady_siete=(String)bundle.get("ady_siete");
        ady_ocho=(String)bundle.get("ady_ocho");
        ady_nueve=(String)bundle.get("ady_nueve");
        ady_diez=(String)bundle.get("ady_diez");

        op_uno=(String)bundle.get("op_uno");
        op_dos=(String)bundle.get("op_dos");
        op_tres=(String)bundle.get("op_tres");
        op_cuatro=(String)bundle.get("op_cuatro");
        op_cinco=(String)bundle.get("op_cinco");
        op_seis=(String)bundle.get("op_seis");
        op_siete=(String)bundle.get("op_siete");
        op_ocho=(String)bundle.get("op_ocho");
        op_nueve=(String)bundle.get("op_nueve");
        op_diez=(String)bundle.get("op_diez");
    }
}
