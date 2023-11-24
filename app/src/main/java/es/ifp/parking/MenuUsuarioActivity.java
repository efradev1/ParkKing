package es.ifp.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuUsuarioActivity extends AppCompatActivity {
    protected TextView labelTitulo;
    protected Button botonBuscar;
    protected Button botonVender;
    protected Button botonMisReservas;
    protected Button botonSalir;
    protected Button botonChat;
    protected Button botonAyuda;
    protected Button botonPerfil;
    protected ImageButton botonAnuncio;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);

        labelTitulo=(TextView) findViewById(R.id.label_Titulo_MenuUsuarioActivity);
        botonBuscar=(Button) findViewById(R.id.boton_Buscar_MenuUsuarioActivity);
        botonVender=(Button) findViewById(R.id.boton_Vender_MenuUsuarioActivity);
        botonMisReservas=(Button) findViewById(R.id.boton_MisReservas_MenuUsuarioActivity);
        botonSalir= (Button)findViewById(R.id.boton_Salir_MenuUsuarioActivity);
        botonChat=(Button) findViewById(R.id.boton_Chat_MenuUsuarioActivity);
        botonAyuda=(Button) findViewById(R.id.Boton_Ayuda_MenuUsuarioActivity);
        botonPerfil=(Button) findViewById(R.id.boton_Perfil_MenuUsuarioActivity);
        botonAnuncio=(ImageButton) findViewById(R.id.botonImagen_Anuncio_MenuUsuarioActivity);

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        botonVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        botonMisReservas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarDialogoConfirmacion();
            }
        });
        botonChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        botonAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        botonAnuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    private void mostrarDialogoConfirmacion() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Está seguro de que desea cerrar la aplicación?");
        builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // No hacer nada, simplemente cerrar el diálogo
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}