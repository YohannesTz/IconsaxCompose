package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PenTool: ImageVector
    get() {
        val current = _penTool
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PenTool",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.75f, y = 22.5f)
                horizontalLineToRelative(dx = 2.52f)
                curveToRelative(dx1 = 0.96f, dy1 = 0.0f, dx2 = 1.58f, dy2 = -0.68f, dx3 = 1.4f, dy3 = -1.51f)
                lineToRelative(dx = -0.41f, dy = -1.81f)
                horizontalLineToRelative(dx = -4.5f)
                lineToRelative(dx = -0.41f, dy = 1.81f)
                curveToRelative(dx1 = -0.18f, dy1 = 0.78f, dx2 = 0.5f, dy2 = 1.51f, dx3 = 1.4f, dy3 = 1.51f)
                moveToRelative(dx = 3.51f, dy = -3.33f)
                lineToRelative(dx = 1.73f, dy = -1.54f)
                curveToRelative(dx1 = 0.97f, dy1 = -0.86f, dx2 = 1.01f, dy2 = -1.46f, dx3 = 0.24f, dy3 = -2.43f)
                lineToRelative(dx = -3.05f, dy = -3.87f)
                curveToRelative(dx1 = -0.64f, dy1 = -0.81f, dx2 = -1.69f, dy2 = -0.81f, dx3 = -2.33f, dy3 = 0.0f)
                lineTo(x = 7.8f, y = 15.2f)
                curveToRelative(dx1 = -0.77f, dy1 = 0.97f, dx2 = -0.77f, dy2 = 1.6f, dx3 = 0.24f, dy3 = 2.43f)
                lineToRelative(dx = 1.73f, dy = 1.54f)
                moveToRelative(dx = 2.24f, dy = -8.05f)
                verticalLineToRelative(dy = 2.53f)
                moveToRelative(dx = -0.86f, dy = -8.46f)
                lineToRelative(dx = -0.78f, dy = -0.78f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.7f)
                lineToRelative(dx = 0.78f, dy = -0.78f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.7f, dy1 = 0.0f)
                lineToRelative(dx = 0.78f, dy = 0.78f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.7f)
                lineToRelative(dx = -0.78f, dy = 0.78f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.7f, dy1 = 0.0f)
                moveToRelative(dx = 8.3f, dy = 4.62f)
                horizontalLineToRelative(dx = 1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = 1.2f)
                verticalLineToRelative(dy = 1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.2f, dy1 = 1.2f)
                horizontalLineToRelative(dx = -1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.2f, dy1 = -1.2f)
                verticalLineToRelative(dy = -1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = -1.2f)
                moveToRelative(dx = -14.9f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = 1.2f)
                verticalLineToRelative(dy = 1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.2f, dy1 = 1.2f)
                horizontalLineToRelative(dx = 1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.2f, dy1 = -1.2f)
                verticalLineToRelative(dy = -1.1f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -1.2f)
                moveToRelative(dx = 13.99f, dy = 0.29f)
                lineToRelative(dx = -5.3f, dy = -5.3f)
                moveToRelative(dx = -7.78f, dy = 5.3f)
                lineToRelative(dx = 5.3f, dy = -5.3f)
            }
        }.build().also { _penTool = it }
    }

@Suppress("ObjectPropertyName")
private var _penTool: ImageVector? = null
