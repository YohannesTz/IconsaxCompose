package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val User: ImageVector
    get() {
        val current = _user
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.User",
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
                moveTo(x = 15.02f, y = 3.01f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 5.0f, dy1 = 5.0f)
                moveToRelative(dx = 3.59f, dy = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.87f, dx2 = -3.85f, dy2 = -7.0f, dx3 = -8.59f, dy3 = -7.0f)
                reflectiveCurveToRelative(dx1 = -8.59f, dy1 = 3.13f, dx2 = -8.59f, dy2 = 7.0f)
            }
        }.build().also { _user = it }
    }

@Suppress("ObjectPropertyName")
private var _user: ImageVector? = null
