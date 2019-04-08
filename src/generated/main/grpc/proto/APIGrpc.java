package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * API is the main Liftbridge server interface clients interact with.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: api.proto")
public final class APIGrpc {

  private APIGrpc() {}

  public static final String SERVICE_NAME = "proto.API";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<proto.Api.CreateStreamRequest,
      proto.Api.CreateStreamResponse> METHOD_CREATE_STREAM = getCreateStreamMethodHelper();

  private static volatile io.grpc.MethodDescriptor<proto.Api.CreateStreamRequest,
      proto.Api.CreateStreamResponse> getCreateStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<proto.Api.CreateStreamRequest,
      proto.Api.CreateStreamResponse> getCreateStreamMethod() {
    return getCreateStreamMethodHelper();
  }

  private static io.grpc.MethodDescriptor<proto.Api.CreateStreamRequest,
      proto.Api.CreateStreamResponse> getCreateStreamMethodHelper() {
    io.grpc.MethodDescriptor<proto.Api.CreateStreamRequest, proto.Api.CreateStreamResponse> getCreateStreamMethod;
    if ((getCreateStreamMethod = APIGrpc.getCreateStreamMethod) == null) {
      synchronized (APIGrpc.class) {
        if ((getCreateStreamMethod = APIGrpc.getCreateStreamMethod) == null) {
          APIGrpc.getCreateStreamMethod = getCreateStreamMethod = 
              io.grpc.MethodDescriptor.<proto.Api.CreateStreamRequest, proto.Api.CreateStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.API", "CreateStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Api.CreateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Api.CreateStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new APIMethodDescriptorSupplier("CreateStream"))
                  .build();
          }
        }
     }
     return getCreateStreamMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSubscribeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<proto.Api.SubscribeRequest,
      proto.Api.Message> METHOD_SUBSCRIBE = getSubscribeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<proto.Api.SubscribeRequest,
      proto.Api.Message> getSubscribeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<proto.Api.SubscribeRequest,
      proto.Api.Message> getSubscribeMethod() {
    return getSubscribeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<proto.Api.SubscribeRequest,
      proto.Api.Message> getSubscribeMethodHelper() {
    io.grpc.MethodDescriptor<proto.Api.SubscribeRequest, proto.Api.Message> getSubscribeMethod;
    if ((getSubscribeMethod = APIGrpc.getSubscribeMethod) == null) {
      synchronized (APIGrpc.class) {
        if ((getSubscribeMethod = APIGrpc.getSubscribeMethod) == null) {
          APIGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<proto.Api.SubscribeRequest, proto.Api.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.API", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Api.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Api.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new APIMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchMetadataMethod()} instead. 
  public static final io.grpc.MethodDescriptor<proto.Api.FetchMetadataRequest,
      proto.Api.FetchMetadataResponse> METHOD_FETCH_METADATA = getFetchMetadataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<proto.Api.FetchMetadataRequest,
      proto.Api.FetchMetadataResponse> getFetchMetadataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<proto.Api.FetchMetadataRequest,
      proto.Api.FetchMetadataResponse> getFetchMetadataMethod() {
    return getFetchMetadataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<proto.Api.FetchMetadataRequest,
      proto.Api.FetchMetadataResponse> getFetchMetadataMethodHelper() {
    io.grpc.MethodDescriptor<proto.Api.FetchMetadataRequest, proto.Api.FetchMetadataResponse> getFetchMetadataMethod;
    if ((getFetchMetadataMethod = APIGrpc.getFetchMetadataMethod) == null) {
      synchronized (APIGrpc.class) {
        if ((getFetchMetadataMethod = APIGrpc.getFetchMetadataMethod) == null) {
          APIGrpc.getFetchMetadataMethod = getFetchMetadataMethod = 
              io.grpc.MethodDescriptor.<proto.Api.FetchMetadataRequest, proto.Api.FetchMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.API", "FetchMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Api.FetchMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Api.FetchMetadataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new APIMethodDescriptorSupplier("FetchMetadata"))
                  .build();
          }
        }
     }
     return getFetchMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static APIStub newStub(io.grpc.Channel channel) {
    return new APIStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static APIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new APIBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static APIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new APIFutureStub(channel);
  }

  /**
   * <pre>
   * API is the main Liftbridge server interface clients interact with.
   * </pre>
   */
  public static abstract class APIImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateStream creates a new stream attached to a NATS subject. It returns
     * an AlreadyExists status code if a stream with the given subject and name
     * already exists.
     * </pre>
     */
    public void createStream(proto.Api.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<proto.Api.CreateStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStreamMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe creates an ephemeral subscription for the given stream. It
     * begins to receive messages starting at the given offset and waits for
     * new messages when it reaches the end of the stream. Use the request
     * context to close the subscription.
     * </pre>
     */
    public void subscribe(proto.Api.SubscribeRequest request,
        io.grpc.stub.StreamObserver<proto.Api.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * FetchMetadata retrieves the latest cluster metadata, including stream
     * broker information.
     * </pre>
     */
    public void fetchMetadata(proto.Api.FetchMetadataRequest request,
        io.grpc.stub.StreamObserver<proto.Api.FetchMetadataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchMetadataMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateStreamMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Api.CreateStreamRequest,
                proto.Api.CreateStreamResponse>(
                  this, METHODID_CREATE_STREAM)))
          .addMethod(
            getSubscribeMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                proto.Api.SubscribeRequest,
                proto.Api.Message>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getFetchMetadataMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Api.FetchMetadataRequest,
                proto.Api.FetchMetadataResponse>(
                  this, METHODID_FETCH_METADATA)))
          .build();
    }
  }

  /**
   * <pre>
   * API is the main Liftbridge server interface clients interact with.
   * </pre>
   */
  public static final class APIStub extends io.grpc.stub.AbstractStub<APIStub> {
    private APIStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APIStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APIStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateStream creates a new stream attached to a NATS subject. It returns
     * an AlreadyExists status code if a stream with the given subject and name
     * already exists.
     * </pre>
     */
    public void createStream(proto.Api.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<proto.Api.CreateStreamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStreamMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe creates an ephemeral subscription for the given stream. It
     * begins to receive messages starting at the given offset and waits for
     * new messages when it reaches the end of the stream. Use the request
     * context to close the subscription.
     * </pre>
     */
    public void subscribe(proto.Api.SubscribeRequest request,
        io.grpc.stub.StreamObserver<proto.Api.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FetchMetadata retrieves the latest cluster metadata, including stream
     * broker information.
     * </pre>
     */
    public void fetchMetadata(proto.Api.FetchMetadataRequest request,
        io.grpc.stub.StreamObserver<proto.Api.FetchMetadataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchMetadataMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * API is the main Liftbridge server interface clients interact with.
   * </pre>
   */
  public static final class APIBlockingStub extends io.grpc.stub.AbstractStub<APIBlockingStub> {
    private APIBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APIBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateStream creates a new stream attached to a NATS subject. It returns
     * an AlreadyExists status code if a stream with the given subject and name
     * already exists.
     * </pre>
     */
    public proto.Api.CreateStreamResponse createStream(proto.Api.CreateStreamRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStreamMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe creates an ephemeral subscription for the given stream. It
     * begins to receive messages starting at the given offset and waits for
     * new messages when it reaches the end of the stream. Use the request
     * context to close the subscription.
     * </pre>
     */
    public java.util.Iterator<proto.Api.Message> subscribe(
        proto.Api.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FetchMetadata retrieves the latest cluster metadata, including stream
     * broker information.
     * </pre>
     */
    public proto.Api.FetchMetadataResponse fetchMetadata(proto.Api.FetchMetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchMetadataMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * API is the main Liftbridge server interface clients interact with.
   * </pre>
   */
  public static final class APIFutureStub extends io.grpc.stub.AbstractStub<APIFutureStub> {
    private APIFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private APIFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new APIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateStream creates a new stream attached to a NATS subject. It returns
     * an AlreadyExists status code if a stream with the given subject and name
     * already exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Api.CreateStreamResponse> createStream(
        proto.Api.CreateStreamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStreamMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FetchMetadata retrieves the latest cluster metadata, including stream
     * broker information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Api.FetchMetadataResponse> fetchMetadata(
        proto.Api.FetchMetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchMetadataMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STREAM = 0;
  private static final int METHODID_SUBSCRIBE = 1;
  private static final int METHODID_FETCH_METADATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final APIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(APIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_STREAM:
          serviceImpl.createStream((proto.Api.CreateStreamRequest) request,
              (io.grpc.stub.StreamObserver<proto.Api.CreateStreamResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((proto.Api.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<proto.Api.Message>) responseObserver);
          break;
        case METHODID_FETCH_METADATA:
          serviceImpl.fetchMetadata((proto.Api.FetchMetadataRequest) request,
              (io.grpc.stub.StreamObserver<proto.Api.FetchMetadataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class APIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    APIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Api.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("API");
    }
  }

  private static final class APIFileDescriptorSupplier
      extends APIBaseDescriptorSupplier {
    APIFileDescriptorSupplier() {}
  }

  private static final class APIMethodDescriptorSupplier
      extends APIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    APIMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (APIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new APIFileDescriptorSupplier())
              .addMethod(getCreateStreamMethodHelper())
              .addMethod(getSubscribeMethodHelper())
              .addMethod(getFetchMetadataMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
