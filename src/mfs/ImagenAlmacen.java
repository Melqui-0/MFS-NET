package mfs;

public class ImagenAlmacen {
    //Codigo para las consultas de la BD
    private int ImagenID;
    private String Operador;
    private String Fecha;
    private byte [] Imagen;

    public int getImagenID() {
        return ImagenID;
    }

    public void setImagenID(int ImagenID) {
        this.ImagenID = ImagenID;
    }

    public String getOperador() {
        return Operador;
    }

    public void setOperador(String Operador) {
        this.Operador = Operador;
    }

    public byte[] getImagen() {
        return Imagen;
    }

    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }
    
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}
