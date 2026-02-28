package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.5f, y = 11.49f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.35f, dy1 = 0.22f)
                lineToRelative(dx = -1.09f, dy = 0.55f)
                lineToRelative(dx = -3.07f, dy = 1.53f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.98f, dy1 = 0.0f)
                lineToRelative(dx = -3.07f, dy = -1.53f)
                lineToRelative(dx = -1.09f, dy = -0.55f)
                quadToRelative(dx1 = -0.18f, dy1 = -0.1f, dx2 = -0.35f, dy2 = -0.22f)
                curveTo(x1 = 5.44f, y1 = 10.75f, x2 = 5.25f, y2 = 9.4f, x3 = 6.1f, y3 = 8.33f)
                lineToRelative(dx = 4.17f, dy = -5.2f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = -0.7f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.67f, dy1 = 0.0f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = 0.7f)
                lineToRelative(dx = 4.17f, dy = 5.2f)
                curveToRelative(dx1 = 0.86f, dy1 = 1.08f, dx2 = 0.67f, dy2 = 2.43f, dx3 = -0.39f, dy3 = 3.16f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.5f, y = 11.5f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.35f, dy1 = 0.21f)
                lineToRelative(dx = -1.09f, dy = 0.55f)
                lineTo(x = 12.0f, y = 9.21f)
                lineToRelative(dx = -4.06f, dy = 3.06f)
                lineToRelative(dx = -1.09f, dy = -0.55f)
                quadToRelative(dx1 = -0.18f, dy1 = -0.1f, dx2 = -0.35f, dy2 = -0.22f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.31f, dy1 = -0.48f)
                lineToRelative(dx = 4.35f, dy = -3.27f)
                verticalLineToRelative(dy = -5.3f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.67f, dy1 = 0.0f)
                verticalLineToRelative(dy = 5.3f)
                lineToRelative(dx = 4.35f, dy = 3.27f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.32f, dy1 = 0.47f)
                moveToRelative(dx = -8.73f, dy = 2.93f)
                lineToRelative(dx = 1.61f, dy = 0.72f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.25f, dy1 = 0.0f)
                lineToRelative(dx = 1.61f, dy = -0.72f)
                curveToRelative(dx1 = 1.44f, dy1 = -0.64f, dx2 = 2.77f, dy2 = 1.1f, dx3 = 1.77f, dy3 = 2.32f)
                lineToRelative(dx = -3.46f, dy = 4.23f)
                curveToRelative(dx1 = -0.85f, dy1 = 1.04f, dx2 = -2.24f, dy2 = 1.04f, dx3 = -3.1f, dy3 = 0.0f)
                lineTo(x = 7.0f, y = 16.75f)
                curveToRelative(dx1 = -1.01f, dy1 = -1.22f, dx2 = 0.32f, dy2 = -2.96f, dx3 = 1.77f, dy3 = -2.32f)
            }
        }.build().also { _ethereum = it }
    }

@Suppress("ObjectPropertyName")
private var _ethereum: ImageVector? = null
