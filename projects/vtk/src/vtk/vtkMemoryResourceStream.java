// java wrapper for vtkMemoryResourceStream object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkMemoryResourceStream extends vtkResourceStream
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

  private native boolean EndOfStream_4();
  public boolean EndOfStream()
  {
    return EndOfStream_4();
  }

  private native long Tell_5();
  public long Tell()
  {
    return Tell_5();
  }

  private native boolean OwnsBuffer_6();
  public boolean OwnsBuffer()
  {
    return OwnsBuffer_6();
  }

  public vtkMemoryResourceStream() { super(); }

  public vtkMemoryResourceStream(long id) { super(id); }
  public native long   VTKInit();

}
