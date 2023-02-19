import { View, Text } from "react-native";

export default function SomeComponent(props) {
    return (
        <View style={{
            margin: 2, padding: 2, borderWidth: 2,
            flex: 1, justifyContent: "center", alignItems: "center"
        }}>
            <Text>SomeComponent</Text>
        </View>
    )
}