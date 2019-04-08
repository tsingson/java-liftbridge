package io.github.liftbridge.grpc;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: api.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getServerStreamSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> METHOD_SERVER_STREAM_SAY_HELLO = getServerStreamSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getServerStreamSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getServerStreamSayHelloMethod() {
    return getServerStreamSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getServerStreamSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getServerStreamSayHelloMethod;
    if ((getServerStreamSayHelloMethod = GreeterGrpc.getServerStreamSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getServerStreamSayHelloMethod = GreeterGrpc.getServerStreamSayHelloMethod) == null) {
          GreeterGrpc.getServerStreamSayHelloMethod = getServerStreamSayHelloMethod = 
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "ServerStreamSayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("ServerStreamSayHello"))
                  .build();
          }
        }
     }
     return getServerStreamSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getClientStreamSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> METHOD_CLIENT_STREAM_SAY_HELLO = getClientStreamSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getClientStreamSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getClientStreamSayHelloMethod() {
    return getClientStreamSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getClientStreamSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getClientStreamSayHelloMethod;
    if ((getClientStreamSayHelloMethod = GreeterGrpc.getClientStreamSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getClientStreamSayHelloMethod = GreeterGrpc.getClientStreamSayHelloMethod) == null) {
          GreeterGrpc.getClientStreamSayHelloMethod = getClientStreamSayHelloMethod = 
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "ClientStreamSayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("ClientStreamSayHello"))
                  .build();
          }
        }
     }
     return getClientStreamSayHelloMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> METHOD_SAY_HELLO_STREAM = getSayHelloStreamMethodHelper();

  private static volatile io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getSayHelloStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getSayHelloStreamMethod() {
    return getSayHelloStreamMethodHelper();
  }

  private static io.grpc.MethodDescriptor<HelloRequest,
          HelloResponse> getSayHelloStreamMethodHelper() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getSayHelloStreamMethod;
    if ((getSayHelloStreamMethod = GreeterGrpc.getSayHelloStreamMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloStreamMethod = GreeterGrpc.getSayHelloStreamMethod) == null) {
          GreeterGrpc.getSayHelloStreamMethod = getSayHelloStreamMethod = 
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayHelloStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHelloStream"))
                  .build();
          }
        }
     }
     return getSayHelloStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    /**
     */
    public void serverStreamSayHello(HelloRequest request,
                                     io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamSayHelloMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<HelloRequest> clientStreamSayHello(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamSayHelloMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<HelloRequest> sayHelloStream(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSayHelloStreamMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                      HelloRequest,
                      HelloResponse>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getServerStreamSayHelloMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                      HelloRequest,
                      HelloResponse>(
                  this, METHODID_SERVER_STREAM_SAY_HELLO)))
          .addMethod(
            getClientStreamSayHelloMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                      HelloRequest,
                      HelloResponse>(
                  this, METHODID_CLIENT_STREAM_SAY_HELLO)))
          .addMethod(
            getSayHelloStreamMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                      HelloRequest,
                      HelloResponse>(
                  this, METHODID_SAY_HELLO_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamSayHello(HelloRequest request,
                                     io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<HelloRequest> clientStreamSayHello(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamSayHelloMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<HelloRequest> sayHelloStream(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSayHelloStreamMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public HelloResponse sayHello(HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<HelloResponse> serverStreamSayHello(
        HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamSayHelloMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloResponse> sayHello(
        HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SERVER_STREAM_SAY_HELLO = 1;
  private static final int METHODID_CLIENT_STREAM_SAY_HELLO = 2;
  private static final int METHODID_SAY_HELLO_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAM_SAY_HELLO:
          serviceImpl.serverStreamSayHello((HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
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
        case METHODID_CLIENT_STREAM_SAY_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamSayHello(
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
        case METHODID_SAY_HELLO_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloStream(
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethodHelper())
              .addMethod(getServerStreamSayHelloMethodHelper())
              .addMethod(getClientStreamSayHelloMethodHelper())
              .addMethod(getSayHelloStreamMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
