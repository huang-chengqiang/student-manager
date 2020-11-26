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

//        String bucketDomain ="https://siyuan-chen.oss-cn-shanghai.aliyuncs.com/";
//        //Endpoint以杭州为例，其他的Region以实际为例
//        String endpoint="http://oss-cn-shanghai.aliyuncs.com";
//        String accessKeyId ="LTAI4GAZ2HqtB6DNR2tCzzDn";
//        String accessKeySecret="PQHmjoqfrvkO9zpmqcT44vQXJDWHAc";
//        //BucketName
//        String BucketName="siyuan-chen";
//        //目录名
//        String fileDir ="student-manage/";
        String bucketDomain ="https://cccsy.oss-cn-shanghai.aliyuncs.com/";
        //Endpoint以杭州为例，其他的Region以实际为例
        String endpoint="http://oss-cn-shanghai.aliyuncs.com";
        String accessKeyId ="LTAI4FySG2jexQN2WDwBvK8W";
        String accessKeySecret="e9N94KxWxiLrJgLIIVn1zd14zMdMJo";
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