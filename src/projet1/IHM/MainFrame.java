package projet1.IHM;

import projet1.Main;
import projet1.solarsystem.Planet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements Runnable, KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, ActionListener
{
    private PanelAjoutSatelite ajoutSatelite;
    private Main main;
    private SolarSystemGraphic solarSystemGraphic;
    private JTabbedPane onglets;
    private PanelAjoutPlanet ajoutPlanet;
    private PanelAjoutEtoile ajoutEtoile;
    static Input input;
    private JButton pause;
    private boolean pauseState;


    public MainFrame(Main main)
    {
        MainFrame.input = new Input();
        this.pause = new JButton("Pause");
        this.pause.addActionListener(this);
        this.add(pause, BorderLayout.SOUTH);
        this.onglets = new JTabbedPane();
        this.main = main;
        this.ajoutEtoile = new PanelAjoutEtoile(this.main, 800, 800);
        this.ajoutSatelite = new PanelAjoutSatelite(this.main, 800,800);
        this.ajoutPlanet = new PanelAjoutPlanet(this.main, 800,800, this.ajoutSatelite);
        solarSystemGraphic = new SolarSystemGraphic(main, 800,800);
        this.setSize(new Dimension(800,800));
        solarSystemGraphic.setPreferredSize(this.getPreferredSize());
        solarSystemGraphic.setSize(this.getPreferredSize());
        this.onglets.add("Systeme Solaire",this.solarSystemGraphic);
        this.onglets.add("Definir Etoile",this.ajoutEtoile);
        this.onglets.add("Ajouter Planete",this.ajoutPlanet);
        this.onglets.add("Ajouter Satelite",this.ajoutSatelite);
        this.getContentPane().add(onglets);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.repaint();
        this.setFocusable(true);
        onglets.addKeyListener(this);
        onglets.addMouseListener(this);
        onglets.addMouseMotionListener(this);
        onglets.addMouseWheelListener(this);
        new Thread(this).start();

    }

    public Input getInput()
    {
        return input;
    }

    @Override
    public void run()
    {
        while(true)
        {

            MainFrame.input.update();
            if(!this.pauseState)
            {
                for(Planet p : this.main.getSolarSystem().getPlanets())
                {
                    p.translate((int)(this.getWidth() / 2 - main.getSolarSystem().getStar().getDiametre() / 2),
                            (int)(this.getHeight() / 2 - main.getSolarSystem().getStar().getDiametre() / 2), (int)p.getDistanceFromSun());
                }
            }

            this.repaint();
            try
            {
                Thread.sleep(1000/60);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        MainFrame.input.setKey(e.getKeyCode(), true);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        MainFrame.input.setKey(e.getKeyCode(), false);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        MainFrame.input.setMouseButton(e.getButton(), true);
        MainFrame.input.setMousePos(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        MainFrame.input.setMouseButton(e.getButton(), false);
        MainFrame.input.setMousePos(e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        MainFrame.input.setMousePos(e.getX(), e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        MainFrame.input.setMousePos(e.getX(), e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        MainFrame.input.setMouseButton(e.getButton(), true);
        MainFrame.input.setMousePos(e.getX(), e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        MainFrame.input.setMousePos(e.getX(), e.getY());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e)
    {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        this.pauseState = !this.pauseState;
    }
}
