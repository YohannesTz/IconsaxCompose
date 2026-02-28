package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cloud: ImageVector
    get() {
        val current = _cloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cloud",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.27f, y = 13.01f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.72f, dy1 = -0.41f)
                curveToRelative(dx1 = -4.68f, dy1 = 0.33f, dx2 = -4.68f, dy2 = 7.14f, dx3 = 0.0f, dy3 = 7.47f)
                horizontalLineToRelative(dx = 11.09f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.64f, dy1 = -1.4f)
                curveToRelative(dx1 = 3.29f, dy1 = -2.87f, dx2 = 1.53f, dy2 = -8.64f, dx3 = -2.8f, dy3 = -9.19f)
                curveTo(x1 = 15.92f, y1 = 0.11f, x2 = 2.39f, y2 = 3.67f, x3 = 5.6f, y3 = 12.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.85f, y = 9.92f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.67f, dy1 = -0.41f)
            }
        }.build().also { _cloud = it }
    }

@Suppress("ObjectPropertyName")
private var _cloud: ImageVector? = null
