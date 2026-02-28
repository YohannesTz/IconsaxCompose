package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ethereum: ImageVector
    get() {
        val current = _ethereum
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ethereum",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 8.77f, y = 14.43f)
                lineToRelative(dx = 1.61f, dy = 0.72f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.25f, dy1 = 0.0f)
                lineToRelative(dx = 1.61f, dy = -0.72f)
                curveToRelative(dx1 = 1.44f, dy1 = -0.64f, dx2 = 2.77f, dy2 = 1.1f, dx3 = 1.77f, dy3 = 2.32f)
                lineToRelative(dx = -3.46f, dy = 4.23f)
                curveToRelative(dx1 = -0.85f, dy1 = 1.04f, dx2 = -2.24f, dy2 = 1.04f, dx3 = -3.1f, dy3 = 0.0f)
                lineTo(x = 7.0f, y = 16.75f)
                curveToRelative(dx1 = -1.01f, dy1 = -1.22f, dx2 = 0.32f, dy2 = -2.96f, dx3 = 1.77f, dy3 = -2.32f)
                moveToRelative(dx = -0.2f, dy = -2.76f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.08f, dy1 = 0.85f)
                lineTo(x = 11.0f, y = 13.7f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.98f, dy1 = 0.0f)
                lineToRelative(dx = 2.35f, dy = -1.17f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.08f, dy1 = -0.85f)
                lineTo(x = 12.3f, y = 9.33f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.6f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 9.31f, dy = -3.43f)
                lineToRelative(dx = -4.17f, dy = -5.2f)
                lineToRelative(dx = -0.26f, dy = -0.28f)
                curveToRelative(dx1 = -0.26f, dy1 = -0.25f, dx2 = -0.63f, dy2 = -0.02f, dx3 = -0.63f, dy3 = 0.34f)
                verticalLineToRelative(dy = 4.3f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = 0.4f)
                lineToRelative(dx = 4.15f, dy = 3.12f)
                lineToRelative(dx = 0.18f, dy = 0.13f)
                curveToRelative(dx1 = 0.18f, dy1 = 0.13f, dx2 = 0.43f, dy2 = 0.13f, dx3 = 0.58f, dy3 = -0.03f)
                curveToRelative(dx1 = 0.7f, dy1 = -0.76f, dx2 = 0.69f, dy2 = -1.86f, dx3 = -0.05f, dy3 = -2.78f)
                moveTo(x = 6.11f, y = 8.33f)
                lineToRelative(dx = 4.15f, dy = -5.28f)
                lineToRelative(dx = 0.25f, dy = -0.28f)
                curveToRelative(dx1 = 0.26f, dy1 = -0.25f, dx2 = 0.63f, dy2 = -0.03f, dx3 = 0.63f, dy3 = 0.34f)
                verticalLineToRelative(dy = 4.37f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.2f, dy1 = 0.4f)
                lineToRelative(dx = -4.13f, dy = 3.17f)
                lineToRelative(dx = -0.17f, dy = 0.13f)
                curveToRelative(dx1 = -0.18f, dy1 = 0.13f, dx2 = -0.43f, dy2 = 0.13f, dx3 = -0.59f, dy3 = -0.04f)
                curveToRelative(dx1 = -0.68f, dy1 = -0.77f, dx2 = -0.67f, dy2 = -1.87f, dx3 = 0.06f, dy3 = -2.81f)
            }
        }.build().also { _ethereum = it }
    }

@Suppress("ObjectPropertyName")
private var _ethereum: ImageVector? = null
