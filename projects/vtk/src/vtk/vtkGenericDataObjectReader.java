// java wrapper for vtkGenericDataObjectReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGenericDataObjectReader extends vtkDataReader
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

  private native long GetOutput_4();
  public vtkDataObject GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkDataObject GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGraphOutput_6();
  public vtkGraph GetGraphOutput()
  {
    long temp = GetGraphOutput_6();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMoleculeOutput_7();
  public vtkMolecule GetMoleculeOutput()
  {
    long temp = GetMoleculeOutput_7();

    if (temp == 0) return null;
    return (vtkMolecule)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolyDataOutput_8();
  public vtkPolyData GetPolyDataOutput()
  {
    long temp = GetPolyDataOutput_8();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRectilinearGridOutput_9();
  public vtkRectilinearGrid GetRectilinearGridOutput()
  {
    long temp = GetRectilinearGridOutput_9();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredGridOutput_10();
  public vtkStructuredGrid GetStructuredGridOutput()
  {
    long temp = GetStructuredGridOutput_10();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredPointsOutput_11();
  public vtkStructuredPoints GetStructuredPointsOutput()
  {
    long temp = GetStructuredPointsOutput_11();

    if (temp == 0) return null;
    return (vtkStructuredPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTableOutput_12();
  public vtkTable GetTableOutput()
  {
    long temp = GetTableOutput_12();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTreeOutput_13();
  public vtkTree GetTreeOutput()
  {
    long temp = GetTreeOutput_13();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnstructuredGridOutput_14();
  public vtkUnstructuredGrid GetUnstructuredGridOutput()
  {
    long temp = GetUnstructuredGridOutput_14();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int ReadOutputType_15();
  public int ReadOutputType()
  {
    return ReadOutputType_15();
  }

  private native int ReadMetaDataSimple_16(byte[] id0, int len0,vtkInformation id1);
  public int ReadMetaDataSimple(String id0,vtkInformation id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadMetaDataSimple_16(bytes0, bytes0.length,id1);
  }

  private native int ReadMeshSimple_17(byte[] id0, int len0,vtkDataObject id1);
  public int ReadMeshSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadMeshSimple_17(bytes0, bytes0.length,id1);
  }

  public vtkGenericDataObjectReader() { super(); }

  public vtkGenericDataObjectReader(long id) { super(id); }
  public native long   VTKInit();

}
