package com.example.daniloenriquediazrios.academia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button Estudiante, Profesor, Amdministrativo, Lista;
    List<universidad> lista = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Estudiante = (Button) findViewById(R.id.button6);

        Estudiante.setOnClickListener(new View.OnClickListener() {

                                          public void onClick(View view) {


                                              EditText nombre = (EditText) findViewById(R.id.editText2);
                                              EditText apellido = (EditText) findViewById(R.id.editText3);
                                              EditText telefono = (EditText) findViewById(R.id.editText4);

                                              //TextView mostrar = (TextView) findViewById(R.id.textView7);

                                              universidad u = Factory.obtenerpersona("estudiante");

                                              u.ingresarnombre(nombre.getText().toString());
                                              u.ingresartelefono(telefono.getText().toString());
                                              u.ingresartipo("estudiante");


                                              //mostrar.setText("Nombre : " + u.obtenernombre().toString() + "\n" + "Telefono : "
                                                //      + u.obtenertelefono().toString() + "\n" + "Tipo : " + u.obtenertipo());


                                              lista.add(u);
                                              Singleton.getInstance().memoria.put("estudiante", lista);




                                          }


                                      }


        );


        Profesor = (Button) findViewById(R.id.button8);

        Profesor.setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {


                                            EditText nombre = (EditText) findViewById(R.id.editText2);
                                            EditText apellido = (EditText) findViewById(R.id.editText3);
                                            EditText telefono = (EditText) findViewById(R.id.editText4);

                                            //TextView mostrar = (TextView) findViewById(R.id.textView7);

                                            universidad u = Factory.obtenerpersona("profesor");

                                            u.ingresarnombre(nombre.getText().toString());
                                            u.ingresartelefono(telefono.getText().toString());
                                            u.ingresartipo("profesor");


                                           // mostrar.setText("Nombre : " + u.obtenernombre().toString() + "\n" + "Telefono : "
                                                   // + u.obtenertelefono().toString() + "\n" + "Tipo : " + u.obtenertipo());
                                            lista.add(u);
                                            Singleton.getInstance().memoria.put("profesor", lista);


                                        }


                                    }


        );


        Amdministrativo = (Button) findViewById(R.id.button9);

        Amdministrativo.setOnClickListener(new View.OnClickListener() {

                                               public void onClick(View view) {


                                                   EditText nombre = (EditText) findViewById(R.id.editText2);
                                                   EditText apellido = (EditText) findViewById(R.id.editText3);
                                                   EditText telefono = (EditText) findViewById(R.id.editText4);

                                                  // TextView mostrar = (TextView) findViewById(R.id.textView7);

                                                   universidad u = Factory.obtenerpersona("administrativo");

                                                   u.ingresarnombre(nombre.getText().toString());
                                                   u.ingresartelefono(telefono.getText().toString());
                                                   u.ingresartipo("administrativo");


                                                   //mostrar.setText("Nombre : " + u.obtenernombre().toString() + "\n" + "Telefono : "
                                                     //      + u.obtenertelefono().toString() + "\n" + "Tipo : " + u.obtenertipo());


                                                   lista.add(u);
                                                   Singleton.getInstance().memoria.put("administrativo", lista);
                                               }


                                           }


        );

        Lista = (Button) findViewById(R.id.button2);

        Lista.setOnClickListener(new View.OnClickListener() {

                                               public void onClick(View view) {



                                                   String dato="";

                                                   TextView mostrar = (TextView) findViewById(R.id.textView8);

                                                   List<universidad> lista = new ArrayList<>();
                                                   List<universidad> lista1 = new ArrayList<>();
                                                   List<universidad> lista2 = new ArrayList<>();



                                                   if((List<universidad>)Singleton.getInstance().memoria.get("estudiante")!=null){
                                                       lista=(List<universidad>)Singleton.getInstance().memoria.get("estudiante");
                                                   }

                                                   if((List<universidad>)Singleton.getInstance().memoria.get("profesor")!=null){
                                                       lista1=(List<universidad>)Singleton.getInstance().memoria.get("profesor");
                                                   }

                                                   if((List<universidad>)Singleton.getInstance().memoria.get("administrativo")!=null){
                                                       lista2=(List<universidad>)Singleton.getInstance().memoria.get("administrativo");
                                                   }



                                                   if (lista.size() >0){
                                                       for (int i=0; i<lista.size(); i++){
                                                           dato+="Nombre"+lista.get(i).obtenernombre() + "\n" +
                                                                   "Telefono" + lista.get(i).obtenertelefono() +"\n" +
                                                                   "Tipo" + lista.get(i).obtenertipo() +"\n"
                                                           ;
                                                       }



                                                       mostrar.setText(dato);
                                                   }

                                                   if (lista1.size() >0){
                                                       for (int i=0; i<lista1.size(); i++){
                                                           dato+="Nombre"+lista1.get(i).obtenernombre() + "\n" +
                                                                   "Telefono" + lista1.get(i).obtenertelefono() +"\n"  +
                                                                   "Tipo" + lista1.get(i).obtenertipo() +"\n"
                                                           ;
                                                       }



                                                       mostrar.setText(dato);
                                                   }

                                                   if (lista2.size() >0){
                                                       for (int i=0; i<lista2.size(); i++){
                                                           dato+="Nombre"+lista2.get(i).obtenernombre() + "\n" +
                                                                   "Telefono" + lista2.get(i).obtenertelefono() +"\n"  +
                                                                   "Tipo" + lista2.get(i).obtenertipo() +"\n"
                                                           ;
                                                       }



                                                       mostrar.setText(dato);
                                                   }




                                               }


                                           }


        );


    }


}
