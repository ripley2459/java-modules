// java wrapper for vtkImagePadFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkImagePadFilter extends vtkThreadedImageAlgorithm
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

  private native void SetOutputWholeExtent_4(int id0[]);
  public void SetOutputWholeExtent(int id0[])
  {
    SetOutputWholeExtent_4(id0);
  }

  private native void SetOutputWholeExtent_5(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetOutputWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetOutputWholeExtent_5(id0,id1,id2,id3,id4,id5);
  }

  private native void GetOutputWholeExtent_6(int id0[]);
  public void GetOutputWholeExtent(int id0[])
  {
    GetOutputWholeExtent_6(id0);
  }

  private native int[] GetOutputWholeExtent_7();
  public int[] GetOutputWholeExtent()
  {
    return GetOutputWholeExtent_7();
  }

  private native void SetOutputNumberOfScalarComponents_8(int id0);
  public void SetOutputNumberOfScalarComponents(int id0)
  {
    SetOutputNumberOfScalarComponents_8(id0);
  }

  private native int GetOutputNumberOfScalarComponents_9();
  public int GetOutputNumberOfScalarComponents()
  {
    return GetOutputNumberOfScalarComponents_9();
  }

  public vtkImagePadFilter() { super(); }

  public vtkImagePadFilter(long id) { super(id); }
  public native long   VTKInit();

}
