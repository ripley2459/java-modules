// java wrapper for vtkFileResourceStream object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkFileResourceStream extends vtkResourceStream
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

  private native boolean Open_4(byte[] id0, int len0);
  public boolean Open(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Open_4(bytes0, bytes0.length);
  }

  private native boolean EndOfStream_5();
  public boolean EndOfStream()
  {
    return EndOfStream_5();
  }

  private native long Tell_6();
  public long Tell()
  {
    return Tell_6();
  }

  public vtkFileResourceStream() { super(); }

  public vtkFileResourceStream(long id) { super(id); }
  public native long   VTKInit();

}
