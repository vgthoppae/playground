import "reflect-metadata";
import { HeaderConsumer } from "./headerConsumer";

const headerConsumer = new HeaderConsumer();
export const handler = headerConsumer.handler;
