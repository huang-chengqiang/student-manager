package com.faine.ts.utils;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import java.io.File;
import java.util.UUID;

/**
 * @ ClassName Aliossutils
 * @ Description TODO
 * @ Author faine
 * @ Date 2020/11/26
 */

public class AliOSSUtil {
    public static String ossUpload(File file){

//        String bucketDomain ="";
//        //Endpoint以杭州为例，其他的Region以实际为例
//        String endpoint="";
//        String accessKeyId ="";
//        String accessKeySecret="";
//        //BucketName
//        String BucketName="";
//        //目录名
//        String fileDir ="student-manage/";
        String bucketDomain ="";
        //Endpoint以杭州为例，其他的Region以实际为例
        String endpoint="";
        String accessKeyId ="";
        String accessKeySecret="";
        //BucketName
        String BucketName="cccsy";
        //目录名
        String fileDir ="sm/";
        //获得本地文件的文件名
        String fileName =file.getName();
        //上传后的文件名生成，这里会将客户端的文件保留扩展名，主文件名用UUID生成
        String fileKey = UUID.randomUUID().toString()+fileName.substring(fileName.indexOf("."));
        OSS ossClient = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
        ossClient.putObject(BucketName,fileDir+fileKey,file);
        ossClient.shutdown();
        return  bucketDomain+fileDir+fileKey;
    }
    public static void main(String[] args){
        File file =new File("D:\\student-manager\\src\\main\\resources\\img\\tu1.png");
        String url =ossUpload(file);
        System.out.println(url);
        System.out.println("上传成功");
    }
}
