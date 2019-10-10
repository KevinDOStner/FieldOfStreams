class flowFile {
   static void main(String[] args) {
 try {
        flowFile = session.create()
        flowFile = session.putAttribute(dataObject.getValue() as String)
        flowFile.split('|')
        session.transfer(flowFile, REL_SUCCESS)
    } catch (Exception e) {
        log.error("something is wrong", ex);
        throw new Exception("something wrong in flow block");
        }
