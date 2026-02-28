package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudChange: ImageVector
    get() {
        val current = _cloudChange
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudChange",
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
                moveTo(x = 8.11f, y = 11.85f)
                curveToRelative(dx1 = -2.82f, dy1 = 0.2f, dx2 = -2.81f, dy2 = 4.3f, dx3 = 0.0f, dy3 = 4.5f)
                horizontalLineToRelative(dx = 6.67f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.19f, dy1 = -0.84f)
                curveToRelative(dx1 = 1.98f, dy1 = -1.73f, dx2 = 0.92f, dy2 = -5.2f, dx3 = -1.68f, dy3 = -5.53f)
                curveToRelative(dx1 = -0.93f, dy1 = -5.64f, dx2 = -9.08f, dy2 = -3.5f, dx3 = -7.15f, dy3 = 1.87f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 15.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.0f, dy1 = 7.0f)
                lineToRelative(dx = -1.05f, dy = -1.75f)
                moveTo(x = 22.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.0f, dy1 = -7.0f)
                lineToRelative(dx = 1.05f, dy = 1.75f)
            }
        }.build().also { _cloudChange = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudChange: ImageVector? = null
