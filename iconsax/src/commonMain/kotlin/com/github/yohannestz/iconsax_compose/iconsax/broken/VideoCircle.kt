package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoCircle: ImageVector
    get() {
        val current = _videoCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoCircle",
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
                moveTo(x = 12.1f, y = 15.21f)
                curveToRelative(dx1 = -1.65f, dy1 = 0.95f, dx2 = -3.0f, dy2 = 0.17f, dx3 = -3.0f, dy3 = -1.73f)
                verticalLineToRelative(dy = -2.96f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.91f, dx2 = 1.35f, dy2 = -2.68f, dx3 = 3.0f, dy3 = -1.73f)
                lineToRelative(dx = 1.28f, dy = 0.74f)
                lineToRelative(dx = 1.28f, dy = 0.74f)
                curveToRelative(dx1 = 1.65f, dy1 = 0.95f, dx2 = 1.65f, dy2 = 2.51f, dx3 = 0.0f, dy3 = 3.46f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _videoCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _videoCircle: ImageVector? = null
