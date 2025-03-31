// java wrapper for vtkXMLStructuredDataWriter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkXMLStructuredDataWriter extends vtkXMLWriter
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

  private native void SetNumberOfPieces_4(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_4(id0);
  }

  private native int GetNumberOfPieces_5();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_5();
  }

  private native void SetWritePiece_6(int id0);
  public void SetWritePiece(int id0)
  {
    SetWritePiece_6(id0);
  }

  private native int GetWritePiece_7();
  public int GetWritePiece()
  {
    return GetWritePiece_7();
  }

  private native void SetGhostLevel_8(int id0);
  public void SetGhostLevel(int id0)
  {
    SetGhostLevel_8(id0);
  }

  private native int GetGhostLevel_9();
  public int GetGhostLevel()
  {
    return GetGhostLevel_9();
  }

  private native void SetWriteExtent_10(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWriteExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWriteExtent_10(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWriteExtent_11(int id0[]);
  public void SetWriteExtent(int id0[])
  {
    SetWriteExtent_11(id0);
  }

  private native int[] GetWriteExtent_12();
  public int[] GetWriteExtent()
  {
    return GetWriteExtent_12();
  }

  public vtkXMLStructuredDataWriter() { super(); }

  public vtkXMLStructuredDataWriter(long id) { super(id); }

}
