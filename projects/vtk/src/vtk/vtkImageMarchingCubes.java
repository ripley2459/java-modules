// java wrapper for vtkImageMarchingCubes object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkImageMarchingCubes extends vtkPolyDataAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetValue_4(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_4(id0,id1);
  }

  private native double GetValue_5(int id0);
  public double GetValue(int id0)
  {
    return GetValue_5(id0);
  }

  private native void SetNumberOfContours_6(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_6(id0);
  }

  private native long GetNumberOfContours_7();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_7();
  }

  private native void GenerateValues_8(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_8(id0,id1);
  }

  private native void GenerateValues_9(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_9(id0,id1,id2);
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  private native void SetComputeScalars_11(int id0);
  public void SetComputeScalars(int id0)
  {
    SetComputeScalars_11(id0);
  }

  private native int GetComputeScalars_12();
  public int GetComputeScalars()
  {
    return GetComputeScalars_12();
  }

  private native void ComputeScalarsOn_13();
  public void ComputeScalarsOn()
  {
    ComputeScalarsOn_13();
  }

  private native void ComputeScalarsOff_14();
  public void ComputeScalarsOff()
  {
    ComputeScalarsOff_14();
  }

  private native void SetComputeNormals_15(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_15(id0);
  }

  private native int GetComputeNormals_16();
  public int GetComputeNormals()
  {
    return GetComputeNormals_16();
  }

  private native void ComputeNormalsOn_17();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_17();
  }

  private native void ComputeNormalsOff_18();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_18();
  }

  private native void SetComputeGradients_19(int id0);
  public void SetComputeGradients(int id0)
  {
    SetComputeGradients_19(id0);
  }

  private native int GetComputeGradients_20();
  public int GetComputeGradients()
  {
    return GetComputeGradients_20();
  }

  private native void ComputeGradientsOn_21();
  public void ComputeGradientsOn()
  {
    ComputeGradientsOn_21();
  }

  private native void ComputeGradientsOff_22();
  public void ComputeGradientsOff()
  {
    ComputeGradientsOff_22();
  }

  private native long GetLocatorPoint_23(int id0,int id1,int id2);
  public long GetLocatorPoint(int id0,int id1,int id2)
  {
    return GetLocatorPoint_23(id0,id1,id2);
  }

  private native void AddLocatorPoint_24(int id0,int id1,int id2,long id3);
  public void AddLocatorPoint(int id0,int id1,int id2,long id3)
  {
    AddLocatorPoint_24(id0,id1,id2,id3);
  }

  private native void IncrementLocatorZ_25();
  public void IncrementLocatorZ()
  {
    IncrementLocatorZ_25();
  }

  private native void SetInputMemoryLimit_26(long id0);
  public void SetInputMemoryLimit(long id0)
  {
    SetInputMemoryLimit_26(id0);
  }

  private native long GetInputMemoryLimit_27();
  public long GetInputMemoryLimit()
  {
    return GetInputMemoryLimit_27();
  }

  public vtkImageMarchingCubes() { super(); }

  public vtkImageMarchingCubes(long id) { super(id); }
  public native long   VTKInit();

}
