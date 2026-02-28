package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Export: ImageVector
    get() {
        val current = _export
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Export",
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
                moveTo(x = 17.52f, y = 18.01f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 20.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -8.0f, dy2 = -3.58f, dx3 = -8.0f, dy3 = -8.0f)
                moveToRelative(dx = 16.0f, dy = 0.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.49f, dy1 = 2.97f)
                moveTo(x = 9.44f, y = 6.47f)
                lineTo(x = 12.0f, y = 3.91f)
                lineToRelative(dx = 2.56f, dy = 2.56f)
                moveTo(x = 12.0f, y = 9.15f)
                verticalLineTo(y = 3.98f)
                moveToRelative(dx = 0.0f, dy = 10.17f)
                verticalLineToRelative(dy = -1.96f)
            }
        }.build().also { _export = it }
    }

@Suppress("ObjectPropertyName")
private var _export: ImageVector? = null
