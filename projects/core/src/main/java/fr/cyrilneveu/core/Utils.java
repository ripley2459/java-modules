package fr.cyrilneveu.core;

import com.profesorfalken.jpowershell.PowerShell;
import vtk.vtkNativeLibrary;

import javax.swing.*;

public class Utils {
    private Utils() {
        // Rien
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void createFrame() {
        JFrame frame = new JFrame();
        JButton button = new JButton("My frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBounds(150, 200, 220, 50);
        frame.add(button);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void executeShell() {
        PowerShell.executeSingleCommand("echo Hello!");
        System.out.println("> Shell Command executed");
    }

    public static void loadVtk() {
        try {
            System.out.println("Loading VTK...");

            if (!vtkNativeLibrary.LoadAllNativeLibraries()) {
                for (final vtkNativeLibrary lib : vtkNativeLibrary.values()) {
                    if (!lib.IsLoaded()) {
                        System.out.println(lib.GetLibraryName() + " not loaded");
                    }
                }
            }
            vtkNativeLibrary.DisableOutputWindow(null);

            System.out.println("VTK successfully loaded");
        } catch (final Exception e) {
            e.printStackTrace();
            System.err.println("Failed to open VTK");
        }
    }
}
