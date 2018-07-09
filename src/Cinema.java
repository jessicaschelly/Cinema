
import controladores.ControladorEntidades;
import telas.MainFrame;

public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ControladorEntidades.getInstance();
        MainFrame mf = new MainFrame(1);
        mf.setLocation(0, 100);
        mf.setVisible(true);
        mf.exibeTelaPrincipal();

        mf = new MainFrame(2);
        mf.setLocation(802, 100);
        mf.setVisible(true);
        mf.exibeTelaPrincipal();

    }

}
