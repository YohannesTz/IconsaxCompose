package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KyberNetwork: ImageVector
    get() {
        val current = _kyberNetwork
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.KyberNetwork",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.82f, y = 8.7f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.57f, dy1 = 0.93f)
                lineToRelative(dx = -0.04f, dy = 5.42f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = 0.9f)
                lineToRelative(dx = -4.68f, dy = -2.8f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.03f, dy1 = -1.83f)
                close()
                moveToRelative(dx = 1.43f, dy = -2.42f)
                curveToRelative(dx1 = 0.15f, dy1 = 0.38f, dx2 = -0.08f, dy2 = 0.77f, dx3 = -0.44f, dy3 = 0.97f)
                lineToRelative(dx = -5.63f, dy = 3.11f)
                arcToRelative(a = 1.05f, b = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.54f, dy1 = -1.15f)
                lineToRelative(dx = 1.22f, dy = -5.53f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.56f, dy1 = -0.69f)
                lineToRelative(dx = 3.92f, dy = 2.24f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.91f, dy1 = 1.05f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.01f, y = 2.67f)
                lineToRelative(dx = -2.07f, dy = 9.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.44f)
                lineToRelative(dx = 1.73f, dy = 8.68f)
                curveToRelative(dx1 = 0.12f, dy1 = 0.6f, dx2 = -0.39f, dy2 = 1.17f, dx3 = -0.89f, dy3 = 0.8f)
                lineToRelative(dx = -5.29f, dy = -3.77f)
                arcTo(horizontalEllipseRadius = 2.1f, verticalEllipseRadius = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.6f, y1 = 16.4f)
                verticalLineTo(y = 7.1f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.07f, dy1 = -1.85f)
                lineToRelative(dx = 5.29f, dy = -3.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.47f, dy1 = -0.2f)
                curveToRelative(dx1 = 0.38f, dy1 = -0.14f, dx2 = 0.66f, dy2 = 0.24f, dx3 = 0.58f, dy3 = 0.62f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.63f, y = 16.81f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.08f, dy1 = 1.76f)
                lineToRelative(dx = -3.47f, dy = 2.52f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.66f, dy1 = -0.65f)
                lineToRelative(dx = -1.02f, dy = -5.2f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.58f, dy1 = -1.11f)
                close()
            }
        }.build().also { _kyberNetwork = it }
    }

@Suppress("ObjectPropertyName")
private var _kyberNetwork: ImageVector? = null
