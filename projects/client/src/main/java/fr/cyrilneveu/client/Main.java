package fr.cyrilneveu.client;

import fr.cyrilneveu.core.Utils;
import vtk.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from client!");

        int result = Utils.add(3, 3);
        System.out.println("Result=" + result);

        // Utils.executeShell();

        Utils.createFrame();
        testVtk();
    }

    private static void testVtk() {
        Utils.loadVtk();

        // Créer une sphère
        vtkSphereSource sphereSource = new vtkSphereSource();
        sphereSource.Update();

        // Créer un mapper
        vtkPolyDataMapper mapper = new vtkPolyDataMapper();
        mapper.SetInputConnection(sphereSource.GetOutputPort());

        // Créer un acteur
        vtkActor actor = new vtkActor();
        actor.SetMapper(mapper);

        // Créer un rendu
        vtkRenderer renderer = new vtkRenderer();
        renderer.AddActor(actor);
        renderer.SetBackground(0.1, 0.2, 0.4);  // couleur de fond

        // Créer une fenêtre de rendu
        vtkRenderWindow renderWindow = new vtkRenderWindow();
        renderWindow.AddRenderer(renderer);

        // Créer une fenêtre de rendu pour l'affichage
        vtkRenderWindowInteractor renderWindowInteractor = new vtkRenderWindowInteractor();
        renderWindowInteractor.SetRenderWindow(renderWindow);

        // Afficher la fenêtre
        renderWindow.Render();
        renderWindowInteractor.Start();
    }
}