package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Electricity: ImageVector
    get() {
        val current = _electricity
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Electricity",
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
                moveTo(x = 17.5f, y = 7.96f)
                verticalLineTo(y = 6.91f)
                arcTo(horizontalEllipseRadius = 1.9f, verticalEllipseRadius = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.59f, y1 = 5.0f)
                horizontalLineTo(x = 8.42f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.91f, dy1 = 1.91f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = 1.5f, dy2 = 4.0f, dx3 = 4.0f, dy3 = 4.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.5f, dy1 = 0.0f, dx2 = 4.0f, dy2 = -1.8f, dx3 = 4.0f, dy3 = -4.0f)
                moveTo(x = 9.5f, y = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 5.0f, dy = -3.0f)
                verticalLineToRelative(dy = 3.0f)
                moveTo(x = 12.0f, y = 22.0f)
                verticalLineToRelative(dy = -6.0f)
            }
        }.build().also { _electricity = it }
    }

@Suppress("ObjectPropertyName")
private var _electricity: ImageVector? = null
