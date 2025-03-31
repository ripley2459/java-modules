package vtk;

import java.util.Properties;
import java.util.StringTokenizer;

public class vtkSettings
{
  private static String GetVTKBuildLibDir() { return "C:/Dev/VTK/vtk-master-build/lib"; }
  private static String GetVTKInstallLibDir() { return "C:/Program Files (x86)/VTK/"; }

  private static String[] Split(String str, String sep)
    {
    StringTokenizer st = new StringTokenizer(str, sep);
    int size = st.countTokens();
    String[] res = new String[size];
    int cnt = 0;
    while (st.hasMoreTokens())
      {
      res[cnt] = st.nextToken();
      cnt ++;
      }
    return res;
    }

  public static String GetVTKLibraryDir()
    {
    String lpath = null;
    Properties p = System.getProperties();
    String path_separator = p.getProperty("path.separator");
    String s = p.getProperty("java.class.path");
    String[] paths = vtkSettings.Split(s, path_separator);
    int cc;
    for ( cc = 0; cc < paths.length; cc ++ )
      {
      if ( paths[cc].endsWith("vtk.jar") )
        {
        lpath = paths[cc].substring(0, paths[cc].length()-"vtk.jar".length());
        lpath = lpath + "vtk-Windows-AMD64";
        }
      }
    if ( lpath == null )
      {
      lpath = vtkSettings.GetVTKInstallLibDir();
      }
    return lpath;
    }

  public static String[] GetKits()
    {
    return vtkSettings.Split("vtkViewsContext2D;vtkTestingRendering;vtkViewsInfovis;vtkCommonColor;vtkRenderingVolumeOpenGL2;vtkRenderingLabel;vtkRenderingLOD;vtkRenderingLICOpenGL2;vtkRenderingImage;vtkRenderingContextOpenGL2;vtkRenderingCellGrid;vtkIOVeraOut;vtkIOTecplotTable;vtkIOSegY;vtkIOParallelXML;vtkIOParallel;vtkIOPLY;vtkIOOggTheora;vtkIONetCDF;vtkIOMotionFX;vtkIOMINC;vtkIOLSDyna;vtkIOImport;vtkIOIOSS;vtkIOFLUENTCFF;vtkIOVideo;vtkIOMovie;vtkIOFDS;vtkIOInfovis;vtkIOExportPDF;vtkIOExportGL2PS;vtkRenderingGL2PSOpenGL2;vtkIOExodus;vtkIOEnSight;vtkIOCityGML;vtkIOChemistry;vtkIOCesium3DTiles;vtkIOCellGrid;vtkIOCONVERGECFD;vtkIOHDF;vtkIOCGNSReader;vtkIOAsynchronous;vtkIOExport;vtkRenderingVtkJS;vtkIOGeometry;vtkRenderingSceneGraph;vtkIOAMR;vtkInteractionImage;vtkImagingStencil;vtkImagingStatistics;vtkImagingMorphological;vtkImagingMath;vtkImagingFourier;vtkIOSQL;vtkGeovisCore;vtkInfovisLayout;vtkViewsCore;vtkInteractionWidgets;vtkRenderingVolume;vtkRenderingAnnotation;vtkImagingHybrid;vtkImagingColor;vtkInteractionStyle;vtkFiltersTopology;vtkFiltersTensor;vtkFiltersTemporal;vtkFiltersSelection;vtkFiltersSMP;vtkFiltersReduction;vtkFiltersProgrammable;vtkFiltersPoints;vtkFiltersParallelImaging;vtkFiltersImaging;vtkImagingGeneral;vtkFiltersGeometryPreview;vtkFiltersGeneric;vtkFiltersFlowPaths;vtkFiltersCellGrid;vtkFiltersAMR;vtkFiltersParallel;vtkFiltersTexture;vtkFiltersModeling;vtkDomainsChemistryOpenGL2;vtkRenderingOpenGL2;vtkRenderingHyperTreeGrid;vtkRenderingUI;vtkFiltersHybrid;vtkDomainsChemistry;vtkChartsCore;vtkInfovisCore;vtkFiltersExtraction;vtkIOXML;vtkIOXMLParser;vtkParallelCore;vtkIOLegacy;vtkIOCore;vtkFiltersStatistics;vtkFiltersHyperTree;vtkImagingSources;vtkIOImage;vtkRenderingContext2D;vtkRenderingFreeType;vtkRenderingCore;vtkFiltersSources;vtkImagingCore;vtkFiltersGeneral;vtkFiltersVerdict;vtkFiltersGeometry;vtkCommonComputationalGeometry;vtkFiltersCore;vtkCommonExecutionModel;vtkCommonDataModel;vtkCommonSystem;vtkCommonMisc;vtkCommonTransforms;vtkCommonMath;vtkCommonCore", ";");
    }
}
