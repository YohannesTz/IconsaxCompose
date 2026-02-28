package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.28f, y = 2.96f)
                curveTo(x1 = 13.0f, y1 = 2.0f, x2 = 12.0f, y2 = 3.08f, x3 = 12.0f, y3 = 5.68f)
                verticalLineToRelative(dy = 2.88f)
                curveTo(x1 = 12.0f, y1 = 11.0f, x2 = 13.0f, y2 = 12.0f, x3 = 15.0f, y3 = 12.0f)
                horizontalLineToRelative(dx = 3.32f)
                curveToRelative(dx1 = 2.6f, dy1 = 0.0f, dx2 = 3.68f, dy2 = -1.0f, dx3 = 2.72f, dy3 = -4.28f)
                arcTo(horizontalEllipseRadius = 7.0f, verticalEllipseRadius = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.0f, y1 = 5.63f)
                moveToRelative(dx = -17.88f, dy = 8.8f)
                arcTo(horizontalEllipseRadius = 9.1f, verticalEllipseRadius = 9.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.26f, y1 = 4.01f)
                moveTo(x = 20.0f, y = 14.7f)
                arcToRelative(a = 9.1f, b = 9.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -10.42f, dy1 = 7.17f)
                arcTo(horizontalEllipseRadius = 9.0f, verticalEllipseRadius = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 18.61f)
            }
        }.build().also { _graph = it }
    }

@Suppress("ObjectPropertyName")
private var _graph: ImageVector? = null
