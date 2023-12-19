package ki307.Trofymenko.Lab5;
import java.io.IOException;

public interface ReadWriteData {
    void writeResultToTxt(String fileName) throws IOException;
    void writeResultToBin(String fileName) throws IOException;

    void readResultFromTxt(String fileName) throws IOException;
    void readResultFromBin(String fileName) throws IOException;
}