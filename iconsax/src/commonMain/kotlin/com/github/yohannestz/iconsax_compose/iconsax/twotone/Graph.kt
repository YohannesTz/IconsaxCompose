package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Graph: ImageVector
    get() {
        val current = _graph
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Graph",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.32f, y = 12.0f)
                curveToRelative(dx1 = 2.6f, dy1 = 0.0f, dx2 = 3.68f, dy2 = -1.0f, dx3 = 2.72f, dy3 = -4.28f)
                arcToRelative(a = 7.3f, b = 7.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.76f, dy1 = -4.76f)
                curveTo(x1 = 13.0f, y1 = 2.0f, x2 = 12.0f, y2 = 3.08f, x3 = 12.0f, y3 = 5.68f)
                verticalLineToRelative(dy = 2.88f)
                curveTo(x1 = 12.0f, y1 = 11.0f, x2 = 13.0f, y2 = 12.0f, x3 = 15.0f, y3 = 12.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.0f, y = 14.7f)
                arcToRelative(a = 9.1f, b = 9.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -10.42f, dy1 = 7.17f)
                arcToRelative(a = 9.1f, b = 9.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.46f, dy1 = -7.45f)
                arcToRelative(a = 9.1f, b = 9.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.14f, dy1 = -10.4f)
            }
        }.build().also { _graph = it }
    }

@Suppress("ObjectPropertyName")
private var _graph: ImageVector? = null
