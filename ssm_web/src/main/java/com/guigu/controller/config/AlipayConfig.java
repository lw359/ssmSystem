package com.guigu.controller.config;

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000117647270";

    // 商户私钥，您的PKCS8格式RSA2私钥merchant_private_key
    public static String merchant_privates_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCS65oh11r77UORjYrVxqxGt/ZuKwb3uDr+spCamYhXgPoDreNDcDbSfy95Bnm6JhWPgoCsHMb7qsJQSUcRzw10d1Wo6nkzv7CPHar8RfBLM6gp2Geggc6U+3N+C4QVg/VxiCZU6rT8JwlSYVagrA+O/xiApXFMbCsk78aIXP07OMWTKoeDDo/Dr4or2dVTOtwyzGWaTBTh6h7SPboPHVanWxQ/DXUpj3+08U8ZSQSf/TcU0xKgDVR4mjBQ3YCm7C0Ds0Wc3t5olWBcndzu8sjhBQAwSGtmHxvBUbIKwB84Y+fr9fGBi7a2J8G6bWfotszW+lv/uLgnTXAfXOZ8O5s1AgMBAAECggEAMz2ahxz97YllnHkaJ87fvNZiSzAUgQcvBC+xAUp049fm2qul7JpRdH7JRtN8VvD7ag7g46YxvAplNO0prUtibPFF3eDRHrxHTtLRFKUr1n6Qsu93zOIY85rzP82yZnKcgtkyTUGCl8LhnGq4dNctofjUSeHprva24W4C9wI/i4yM+iGnNRuruL/pKhOHta/6Z6D3hoJzSBpJzJXoIq0qcFnVRHXUvzUst3YnK8Zj9rcJxSPodVWM56w/+ebygu8mfL23k19ttxMjwrzQ6Qyw68ArN23huhVGtWrFblgRshm+Fr1NYIIZWYj6cRkSnZaZFA2v+EmbuCB/v6xYWWoNoQKBgQDIXWTAjvNyfZz+3bJX37FJcyybzwOz8TkdJ4lVNlz6RNEHyL2r1v8qrvHxyTu6mKqmU6sYA6fymFFZpYKCcMVthjG8Dffsj6qTr1TTMgRhlB5NTKZHvkHhTi0YAJcAeZbxDPHQrXg0cXd2a9TOwcWzcWcI+7SdAesH6p/EvkWHWQKBgQC7tzGKWkY5rv+yBinjpkb3I6AcgFIonrvwWljyz+7/JlX4/j7tkMUV1jJzv0vBQI4LKHgetL6wYteNxDKzpI3ifd+Rz8i512JoKzk/+GK9LXYpLXls3vfufozrvi9YzfjJwHr4izygO4u0LCOPi9dA0FCVMnqJFsEx0+bliHzTPQKBgERoFmjjpVw2ZK5jNGtp9NZV2yoK4IHD3rMEd4+/MrlDW3Zj49XSXmXNOs9I2/qV+tU0hZp6TRG3TTblGgy8wbrl8P76aeW7Gwq29qfwUKyb7EiJ3c9qtoVcsmqacPN5j74WpEyRnROSla25nPtGDuB33Cyl+wEL0ZlvUkLSj1xpAoGACETmqsiVRV8/JlF9MOkXQTXRjM/eTqnHb6wbNP8R8S14JhLVJNP2yqJ38H9hz+6PE1DCEeA2ckC4bCdTcHR0R6Dx41N67SzeyeX1jKrddqX1CZVWPwSHeXsbrBrhrRDNv915zU8c6ZYV7mbvXhhz8Af9NMVXfoiBFDfYeQ4NKaUCgYA6a+9HoXvdUYWeZY1HgQoOcsGqy7B4nP1Vcskg6GndsG7WEw6FiNMF8VK9SuLd6R90e9g5V+XwoV9PhxQScIwN8PGRvMUXoupBdZGJ2masNU4NM6rgGk01PT0OEz1/s2VLFo6gOrmbfKUNbG5XEe6d2UWyyBg2y2EMEie5MLuf9w==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqy0ewu5OXo6G5IwAbnf1wUp6saAfIifPY6lr9FCjE8OpQDo3WZ7iQTI0Sp2knFroZYnoEAT3nnnOhaikZatyhUpV+hJR2O+MXTvuXgkLvDjTnsuokzwiD6A7U9a8/yfXWqT38pIP8oTudOpX9dCQcdq39QZbQztjcxI+twWWnh0eHbVAFdmBi6BaeZeQsJOCsEA+VfDbzZCzgmZUEohMOZXpMkj8aknmtaEGgBV1gvtiNWlk1soxLbReQIUOxmRFTBXMVEGCHnNEAGTY+Vm7QAzn7iNC1AS5maJ4NNHNJbgGbI6ysPTjYNsKja2WcOEZ7d5CF2nEdSlRBEv8MA12FwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/#/ShglYm";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
//    public static void logResult(String sWord) {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
//            writer.write(sWord);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

}
