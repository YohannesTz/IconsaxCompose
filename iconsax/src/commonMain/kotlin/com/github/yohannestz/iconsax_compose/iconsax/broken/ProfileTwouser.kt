package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileTwouser: ImageVector
    get() {
        val current = _profileTwouser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProfileTwouser",
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
                moveTo(x = 12.68f, y = 3.96f)
                arcToRelative(a = 4.44f, b = 4.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.85f, dy1 = 6.91f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.27f, dy1 = -4.43f)
                arcTo(horizontalEllipseRadius = 4.44f, verticalEllipseRadius = 4.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 2.0f)
                moveToRelative(dx = 7.41f, dy = 2.0f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.13f, dy1 = 7.0f)
                horizontalLineToRelative(dx = -0.26f)
                moveTo(x = 4.16f, y = 14.56f)
                curveToRelative(dx1 = -2.42f, dy1 = 1.62f, dx2 = -2.42f, dy2 = 4.26f, dx3 = 0.0f, dy3 = 5.87f)
                curveToRelative(dx1 = 2.75f, dy1 = 1.84f, dx2 = 7.26f, dy2 = 1.84f, dx3 = 10.0f, dy3 = 0.0f)
                curveToRelative(dx1 = 2.43f, dy1 = -1.62f, dx2 = 2.43f, dy2 = -4.26f, dx3 = 0.0f, dy3 = -5.87f)
                curveToRelative(dx1 = -2.73f, dy1 = -1.83f, dx2 = -7.24f, dy2 = -1.83f, dx3 = -10.0f, dy3 = 0.0f)
                moveTo(x = 18.34f, y = 20.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.96f, dy1 = -0.87f)
                curveToRelative(dx1 = 1.56f, dy1 = -1.17f, dx2 = 1.56f, dy2 = -3.1f, dx3 = 0.0f, dy3 = -4.27f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.37f, y1 = 14.0f)
            }
        }.build().also { _profileTwouser = it }
    }

@Suppress("ObjectPropertyName")
private var _profileTwouser: ImageVector? = null
