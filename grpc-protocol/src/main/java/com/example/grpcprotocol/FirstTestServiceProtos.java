// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: firstTest.proto

package com.example.grpcprotocol;

public final class FirstTestServiceProtos {
  private FirstTestServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_QueryInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_QueryInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_QueryInfoRequest_FamilyInfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_QueryInfoRequest_FamilyInfoEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_personalInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_personalInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_QueryInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_QueryInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_QueryInfoResponse_SubjectTeachsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_QueryInfoResponse_SubjectTeachsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_subjectMarks_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_subjectMarks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_QuerySomeDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_QuerySomeDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_QuerySomeDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_QuerySomeDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_productInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_productInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_SendBooksInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_SendBooksInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_SendBooksInfoRequest_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_SendBooksInfoRequest_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_SendBooksInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_SendBooksInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_CalculateSumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_CalculateSumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcprotocol_CalculateSumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcprotocol_CalculateSumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017firstTest.proto\022\014grpcprotocol\"\355\001\n\020Quer" +
      "yInfoRequest\022\n\n\002id\030\001 \001(\005\022\016\n\006school\030\002 \001(\t" +
      "\022\r\n\005isBoy\030\003 \001(\010\0227\n\023personalInfoRecords\030\004" +
      " \003(\0132\032.grpcprotocol.personalInfo\022B\n\nfami" +
      "lyInfo\030\005 \003(\0132..grpcprotocol.QueryInfoReq" +
      "uest.FamilyInfoEntry\0321\n\017FamilyInfoEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"4\n\014perso" +
      "nalInfo\022\026\n\016identityNumber\030\001 \001(\003\022\014\n\004name\030" +
      "\002 \001(\t\"\351\001\n\021QueryInfoResponse\022\n\n\002id\030\001 \001(\005\022" +
      "\014\n\004name\030\002 \001(\t\022\014\n\004uuid\030\003 \001(\t\022+\n\007records\030\004" +
      " \003(\0132\032.grpcprotocol.subjectMarks\022I\n\rsubj" +
      "ectTeachs\030\005 \003(\01322.grpcprotocol.QueryInfo" +
      "Response.SubjectTeachsEntry\0324\n\022SubjectTe" +
      "achsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"2\n\014subjectMarks\022\023\n\013subjectName\030\001 \001(\t\022\r" +
      "\n\005score\030\002 \001(\001\"\"\n\024QuerySomeDataRequest\022\n\n" +
      "\002id\030\001 \001(\005\"O\n\025QuerySomeDataResponse\022\n\n\002id" +
      "\030\001 \001(\005\022*\n\007records\030\002 \003(\0132\031.grpcprotocol.p" +
      "roductInfo\".\n\013productInfo\022\021\n\tproductId\030\001" +
      " \001(\005\022\014\n\004time\030\002 \001(\t\"\213\001\n\024SendBooksInfoRequ" +
      "est\022\n\n\002id\030\001 \001(\005\022:\n\004data\030\002 \003(\0132,.grpcprot" +
      "ocol.SendBooksInfoRequest.DataEntry\032+\n\tD" +
      "ataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "\"3\n\025SendBooksInfoResponse\022\014\n\004code\030\001 \001(\005\022" +
      "\014\n\004note\030\002 \001(\t\"1\n\023CalculateSumRequest\022\n\n\002" +
      "id\030\001 \001(\005\022\016\n\006number\030\002 \003(\005\"?\n\024CalculateSum" +
      "Response\022\014\n\004code\030\001 \001(\005\022\014\n\004note\030\002 \001(\t\022\013\n\003" +
      "sum\030\003 \001(\0052\373\002\n\020FirstTestService\022N\n\tQueryI" +
      "nfo\022\036.grpcprotocol.QueryInfoRequest\032\037.gr" +
      "pcprotocol.QueryInfoResponse\"\000\022\\\n\rQueryS" +
      "omeData\022\".grpcprotocol.QuerySomeDataRequ" +
      "est\032#.grpcprotocol.QuerySomeDataResponse" +
      "\"\0000\001\022\\\n\rSendBooksInfo\022\".grpcprotocol.Sen" +
      "dBooksInfoRequest\032#.grpcprotocol.SendBoo" +
      "ksInfoResponse\"\000(\001\022[\n\014CalculateSum\022!.grp" +
      "cprotocol.CalculateSumRequest\032\".grpcprot" +
      "ocol.CalculateSumResponse\"\000(\0010\001B4\n\030com.e" +
      "xample.grpcprotocolB\026FirstTestServicePro" +
      "tosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grpcprotocol_QueryInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcprotocol_QueryInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_QueryInfoRequest_descriptor,
        new java.lang.String[] { "Id", "School", "IsBoy", "PersonalInfoRecords", "FamilyInfo", });
    internal_static_grpcprotocol_QueryInfoRequest_FamilyInfoEntry_descriptor =
      internal_static_grpcprotocol_QueryInfoRequest_descriptor.getNestedTypes().get(0);
    internal_static_grpcprotocol_QueryInfoRequest_FamilyInfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_QueryInfoRequest_FamilyInfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_grpcprotocol_personalInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcprotocol_personalInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_personalInfo_descriptor,
        new java.lang.String[] { "IdentityNumber", "Name", });
    internal_static_grpcprotocol_QueryInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpcprotocol_QueryInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_QueryInfoResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Uuid", "Records", "SubjectTeachs", });
    internal_static_grpcprotocol_QueryInfoResponse_SubjectTeachsEntry_descriptor =
      internal_static_grpcprotocol_QueryInfoResponse_descriptor.getNestedTypes().get(0);
    internal_static_grpcprotocol_QueryInfoResponse_SubjectTeachsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_QueryInfoResponse_SubjectTeachsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_grpcprotocol_subjectMarks_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpcprotocol_subjectMarks_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_subjectMarks_descriptor,
        new java.lang.String[] { "SubjectName", "Score", });
    internal_static_grpcprotocol_QuerySomeDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpcprotocol_QuerySomeDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_QuerySomeDataRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_grpcprotocol_QuerySomeDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grpcprotocol_QuerySomeDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_QuerySomeDataResponse_descriptor,
        new java.lang.String[] { "Id", "Records", });
    internal_static_grpcprotocol_productInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_grpcprotocol_productInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_productInfo_descriptor,
        new java.lang.String[] { "ProductId", "Time", });
    internal_static_grpcprotocol_SendBooksInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_grpcprotocol_SendBooksInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_SendBooksInfoRequest_descriptor,
        new java.lang.String[] { "Id", "Data", });
    internal_static_grpcprotocol_SendBooksInfoRequest_DataEntry_descriptor =
      internal_static_grpcprotocol_SendBooksInfoRequest_descriptor.getNestedTypes().get(0);
    internal_static_grpcprotocol_SendBooksInfoRequest_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_SendBooksInfoRequest_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_grpcprotocol_SendBooksInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_grpcprotocol_SendBooksInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_SendBooksInfoResponse_descriptor,
        new java.lang.String[] { "Code", "Note", });
    internal_static_grpcprotocol_CalculateSumRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_grpcprotocol_CalculateSumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_CalculateSumRequest_descriptor,
        new java.lang.String[] { "Id", "Number", });
    internal_static_grpcprotocol_CalculateSumResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_grpcprotocol_CalculateSumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcprotocol_CalculateSumResponse_descriptor,
        new java.lang.String[] { "Code", "Note", "Sum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
